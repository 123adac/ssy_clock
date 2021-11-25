package com.soft.java.annotation;

public class MyTestTarget {
    @MyTest
    public void test01(){
        System.out.println("test01");
    }

    public void test02(){
        System.out.println("test02");
    }

    @MyTest
    public void test03(){
        System.out.println("test03");
    }
}
