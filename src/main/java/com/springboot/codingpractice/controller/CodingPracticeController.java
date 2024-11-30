package com.springboot.codingpractice.controller;

import com.springboot.codingpractice.service.CodingPracticeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/codingPractice")
public class CodingPracticeController {
    private final CodingPracticeService codingPracticeService;

    @Operation(summary = "문제1", description = "문자열 입력값 추출하기")
    @GetMapping("/problem1")
    public String problem1(
            @Parameter(description = "입력할 문자열") @RequestParam String inputStr) {

        return codingPracticeService.problem1(inputStr);
    }

    @Operation(summary = "문제2", description = "입력받은 두 값을 출력하기")
    @GetMapping("/problem2")
    public String problem2(
            @Parameter(description = "첫번째 정수입력") @RequestParam int inputVal1,
            @Parameter(description = "두번째 정수입력") @RequestParam int inputVal2) {

        return codingPracticeService.problem2(inputVal1, inputVal2);
    }

    @Operation(summary = "문제3", description = "입력받은 문자열 반복 출력하기")
    @GetMapping("/problem3")
    public String problem3(
            @Parameter(description = "입력할 문자열") @RequestParam String inputStr,
            @Parameter(description = "문자열 반복횟수") @RequestParam int inputVal) {

        return codingPracticeService.problem3(inputStr, inputVal);
    }

    @Operation(summary = "문제4", description = "입력받은 알파벳문자열 대소문자 바꿔출력하기")
    @GetMapping("/problem4")
    public String problem4(
            @Parameter(description = "입력할 알파벳 문자열") @RequestParam String inputStr) {

        // 입력값 검증
        if (!inputStr.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("입력값은 영어 알파벳만 포함해야 합니다.");
        }

        return codingPracticeService.problem4(inputStr);
    }
}
