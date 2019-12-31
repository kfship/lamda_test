package com.dev.example;

public class Util {

    String initStr = "ABC";

    public Util(String str) {
        this.initStr = str;
    }

    public Integer add1(Integer x) {
        return x + 1;
    }

    public String concat1(Util obj) {
        return this.initStr + obj.getInitStr();
    }

    public String getInitStr() {
        return this.initStr;
    }

    public void setInitStr(String str) {
        this.initStr = str;
    }
}
