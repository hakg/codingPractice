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

    // 문제5. 특수문자 출력하기
    public String problem5(String inputStr) {
        return inputStr;
    }

    // 문제6. 덧셈식 출력하기
    public int problem6(int inputVal, int inputVal2) throws Exception {
        if (1 <= inputVal && inputVal2 <= 100) {
            return inputVal + inputVal2;
        } else {
            throw new IllegalArgumentException("inputVal은 1이상 inputVal2는 100이하로 입력해주세요.");
        }
    }

    // 문제7. 문자열 붙여서 출력하기
    public String problem7(String inputStr, String inputStr2) throws Exception {
        if (1 <= inputStr.length() && inputStr2.length() <= 10) {
            return inputStr.trim() + inputStr2.trim();
        } else {
            throw new IllegalArgumentException("inputStr 1글자 이상 inputStr2는 10글자 이내로 입력해주세요.");
        }
    }

    // 문제8. 문자열 돌리기
    public String problem8(String inputStr) throws Exception {
        String result = "";
        if (1 <= inputStr.length() && inputStr.length() <= 10) {
            for (char c : inputStr.toCharArray()) {
                result += c + "\n";
            }
            return result;
        } else {
            throw new IllegalArgumentException("문자열은 1글자에서 10글자이내로 입력해주세요.");
        }
    }

    // 문제9. 홀짝 구분하기
    public String problem9(int inputVal) throws Exception {
        if (1 <= inputVal && inputVal <= 1000) {
            return inputVal % 2 == 0 ? inputVal + "is odd" : inputVal + "is even";
        } else {
            throw new IllegalArgumentException("1 ~ 1000 이내로 입력해주세요.");
        }
    }

    // 문제10. 문자열 겹쳐쓰기
    public String problem10(String inputStr, int inputVal, String inputStr2) throws Exception {
        String result = "";
        if (1 <= inputStr2.length() && inputStr2.length() <= inputStr.length() && inputStr.length() <= 1000) {
            result = inputStr.substring(0, inputVal);
            result += inputStr2;
            result += inputStr.substring(result.length(), inputStr.length());
            return result;
        } else {
            throw new IllegalArgumentException("1 ~ 1000 이내로 입력해주세요.");
        }
    }
}
