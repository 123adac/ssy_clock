package com.soft.ioex;

import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        File f = new File("E:/code/aaa/Hello.txt");
        System.out.println(f.getAbsolutePath());

        File f2 = new File("World.txt");
        System.out.println(f2.getAbsolutePath());
    }
}