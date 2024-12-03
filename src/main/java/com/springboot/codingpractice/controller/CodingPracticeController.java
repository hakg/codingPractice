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

    @Operation(summary = "문제1. 문자열 입력값 추출하기")
    @GetMapping("/problem1")
    public String problem1(
            @Parameter(description = "입력할 문자열") @RequestParam String inputStr) {

        return codingPracticeService.problem1(inputStr);
    }

    @Operation(summary = "문제2. 입력받은 두 값을 출력하기")
    @GetMapping("/problem2")
    public String problem2(
            @Parameter(description = "첫번째 정수입력") @RequestParam int inputVal1,
            @Parameter(description = "두번째 정수입력") @RequestParam int inputVal2) {

        return codingPracticeService.problem2(inputVal1, inputVal2);
    }

    @Operation(summary = "문제3. 입력받은 문자열 반복 출력하기")
    @GetMapping("/problem3")
    public String problem3(
            @Parameter(description = "입력할 문자열") @RequestParam String inputStr,
            @Parameter(description = "문자열 반복횟수") @RequestParam int inputVal) {

        return codingPracticeService.problem3(inputStr, inputVal);
    }

    @Operation(summary = "문제4. 입력받은 알파벳문자열 대소문자 바꿔출력하기")
    @GetMapping("/problem4")
    public String problem4(
            @Parameter(description = "입력할 알파벳 문자열") @RequestParam String inputStr) {

        // 입력값 검증
        if (!inputStr.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("입력값은 영어 알파벳만 포함해야 합니다.");
        }

        return codingPracticeService.problem4(inputStr);
    }

    @Operation(summary = "문제5. 특수문자 출력하기")
    @GetMapping("/problem5")
    public String problem5(
            @Parameter(description = "입력할 알파벳 문자열") @RequestParam String inputStr) {
        return codingPracticeService.problem5(inputStr);
    }

    @Operation(summary = "문제6. 덧셈식 출력하기")
    @GetMapping("/problem6")
    public String problem6(
            @Parameter(description = "덧셈할 첫번째 숫자") @RequestParam int inputVal,
            @Parameter(description = "덧셈할 두번째 숫자") @RequestParam int inputVal2) {
        String result = "";
        try {
            result = "" + codingPracticeService.problem6(inputVal, inputVal2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        return result;
    }

    @Operation(summary = "문제7. 문자열 붙여서 출력하기")
    @GetMapping("/problem7")
    public String problem7(
            @Parameter(description = "첫번째 문자열") @RequestParam String inputStr,
            @Parameter(description = "두번째 문자열") @RequestParam String inputStr2) {
        String result = "";
        try {
            result = codingPracticeService.problem7(inputStr, inputStr2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        return result;
    }

    @Operation(summary = "문제8. 문자열 돌리기")
    @GetMapping("/problem8")
    public String problem8(
            @Parameter(description = "입력할 문자열") @RequestParam String inputStr) {
        String result = "";
        try {
            result = codingPracticeService.problem8(inputStr);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    @Operation(summary = "문제9. 홀짝구분하기")
    @GetMapping("/problem9")
    public String problem9(
            @Parameter(description = "입력할 숫자") @RequestParam int inputVal) {
        String result = "";
        try {
            result = codingPracticeService.problem9(inputVal);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    @Operation(summary = "문제10. 문자열 겹쳐쓰기")
    @GetMapping("/problem10")
    public String problem10(
            @Parameter(description = "베이스 문자열 입력") @RequestParam String inputStr,
            @Parameter(description = "입력할 숫자") @RequestParam int inputVal,
            @Parameter(description = "덮어쓸 문자열 입력") @RequestParam String inputStr2) {
        String result = "";
        try {
            result = codingPracticeService.problem10(inputStr, inputVal, inputStr2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    @Operation(summary = "문제11. 문자열섞기")
    @GetMapping("/problem11")
    public String problem11(
            @Parameter(description = "첫번째 문자열 입력") @RequestParam String inputStr,
            @Parameter(description = "두번째 문자열 입력") @RequestParam String inputStr2) {
        String result = "";
        try {
            result = codingPracticeService.problem11(inputStr, inputStr2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    @Operation(summary = "문제12. 문자리스트를 문자열로 변환하기")
    @GetMapping("/problem12")
    public String problem12(
            @Parameter(description = "첫번째 문자리스트 입력") @RequestParam String[] inputStr) {
        String result = "";
        try {
            result = codingPracticeService.problem12(inputStr);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return result;
    }

    @Operation(summary = "문제13. 문자열 곱하기")
    @GetMapping("/problem13")
    public String problem13(
            @Parameter(description = "문자열 입력") @RequestParam String inStr,
            @Parameter(description = "곱하기할 숫자 입력") @RequestParam int inVal) {
        return codingPracticeService.problem13(inStr, inVal);
    }

    @Operation(summary = "문제14. 더 크게 합치기")
    @GetMapping("/problem14")
    public String problem14(
            @Parameter(description = "첫번째 숫자 입력") @RequestParam int inVal,
            @Parameter(description = "두번째 숫자 입력") @RequestParam int inVal2) {
        try {
            return codingPracticeService.problem14(inVal, inVal2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Operation(summary = "문제15. 두 수의 연산값 비교하기")
    @GetMapping("/problem15")
    public String problem15(
            @Parameter(description = "첫번째 숫자 입력") @RequestParam int inVal,
            @Parameter(description = "두번째 숫자 입력") @RequestParam int inVal2) {
        try {
            return codingPracticeService.problem15(inVal, inVal2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
