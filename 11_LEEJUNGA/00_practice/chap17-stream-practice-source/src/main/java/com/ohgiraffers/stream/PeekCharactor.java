package com.ohgiraffers.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekCharactor {
    public static void main(String[] args) {
        // 문제: null이 아닌 문자열 중 "java"를 포함하는 텍스트만 소문자로 출력하세요.
        // Objects::nonNull를 이용해서 null 체크
        List<String> texts = Arrays.asList("I love Java", null, "java is fun", "Python", null);
        // 출력값
        // i love java
        // java is fun

        texts.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .forEach((text) -> {
                    if (text.contains("java")) System.out.println(text);
                });
    }

}
