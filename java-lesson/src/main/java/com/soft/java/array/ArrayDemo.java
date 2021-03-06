package com.soft.java.array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        copySelf();
        copyToOther();
    }

    private static void copySelf(){
        int[] ids={1,2,3,4,5};
        System.out.println("*****************1*****************");
        System.out.println("*****原数组*****");
        System.out.println(Arrays.toString(ids));
        System.arraycopy(ids,0,ids,3,2);
        System.out.println("*****复制后结果*****");
        System.out.println(Arrays.toString(ids));
    }

    private static void copyToOther(){
        int[] ids = {1,2,3,4,5};
        int[] other = new int[5];
        System.out.println("*****************2*****************");
        System.arraycopy(ids,1,other,0,3);
        System.out.println("*****原数组*****");
        System.out.println(Arrays.toString(ids));
        System.out.println("*****其他数组*****");
        System.out.println(Arrays.toString(other));
    }
}
