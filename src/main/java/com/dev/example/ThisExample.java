package com.dev.example;

public class ThisExample {
    public int outter = 10;

    class Inner {

        int inner = 20;

        void method() {
            AInterface ai = () -> {
              System.out.println("outter : " + outter + "\n");
              System.out.println("ThisExample.this.outter : " + ThisExample.this.outter + "\n\n");

              System.out.println("inner : " + inner + "\n");
              System.out.println("this.inner : " + this.inner + "\n\n");
            };

            ai.method();
        }
    }
}
