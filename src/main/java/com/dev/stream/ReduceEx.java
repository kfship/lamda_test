package com.dev.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class ReduceEx {

    public static void main(String[] args) {


        List<String> list=Arrays.asList("Box","Robot","Simple","Complex");

        BinaryOperator<String> bo = (s1, s2)->{
            if(s1.length() > s2.length())
                return s1;
            else
                return s2;
        };

        //첫번째 파라미터는 값이 비어있을 때 출력해주는 default 값이다
        //String str = list.stream().reduce("",bo);
        String str = list.parallelStream().reduce("",bo);

        System.out.println(str);
    }
}
