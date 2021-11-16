package com.soft.ioex;

import java.io.File;

public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("E:/code/aaa/Hello.txt");
        File f2 = new File("E:/code/aaa/World");
        // 判断是否存在
        System.out.println("E:/code/aaa/Hello.txt 是否存在： " + f.exists());
        System.out.println("E:/code/aaa/World 是否存在： " + f2.exists());
        // 判断是文件还是目录
        System.out.println("E:/code/aaa/Hello 是文件：" + f2.isFile());
        System.out.println("E:/code/aaa/Hello 是目录：" + f2.isDirectory());
    }
}