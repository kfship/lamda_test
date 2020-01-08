package com.dev.example.range;

public class RangeTest {

    public static void main(String[] args) {

        ThisExample te = new ThisExample();
        ThisExample.Inner inner = te.new Inner();
        inner.method();
    }
}
