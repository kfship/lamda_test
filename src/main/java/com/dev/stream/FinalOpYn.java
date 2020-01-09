package com.dev.stream;

import java.util.stream.IntStream;

public class FinalOpYn {

    public static void main(String[] args) {

        //최종연산이 없을 때는 중간 과정도 생략된다
        IntStream.of(1, 3, 5)
                .peek(d -> System.out.print(d + "\t"));
        System.out.println("-------------------------");

        //최종연산이 존재하는 스트림의 파이프라인
        IntStream.of(5, 3, 1)
                .peek(d -> System.out.print(d + "\t"))
                .sum();
        System.out.println();

        /*
        *스트림의 최종연산
        스트림의 최종연산은 대표적으로 다음과 같다.
        1.sum()
        2.count()
        3.average()
        4.min()
        5.max()
        */
    }
}
