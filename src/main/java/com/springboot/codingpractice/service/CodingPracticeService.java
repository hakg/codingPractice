package com.springboot.codingpractice.service;

import org.springframework.stereotype.Service;

@Service
public class CodingPracticeService {

    // 문제1. 문자열 입력값 추출하기
    public String problem1(String inputStr) {
        if (!inputStr.isEmpty() && inputStr.length() <= 1000000) {
            System.out.print(inputStr);
        }
        return inputStr;
    }

    // 문제2. 입력받은 두 값을 출력하기
    public String problem2(int inputVal1, int inputVal2) {
        System.out.print(inputVal1);
        System.out.print(inputVal2);
        return inputVal1 + " " + inputVal2;
    }

    // 문제3. 입력받은 문자열 반복 출력하기
    public String problem3(String inputStr, int inputVal) {
        return inputStr.repeat(inputVal);
    }

    // 문제4. 입력받은 알파벳문자열 대소문자 바꿔출력하기
    public String problem4(String inputStr) {
        StringBuilder result = new StringBuilder();

        for (char c : inputStr.toCharArray()) {
            // 대소문자 변환
            result.append(Character.isLowerCase(c) ? Character.toUpperCase(c)
                                                   : Character.isUpperCase(c) ? Character.toLowerCase(c) : c);
        }

        return result.toString();
    }
}
