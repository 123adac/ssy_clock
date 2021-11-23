package com.soft.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HisThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "执行了，将会返回100");
        return 100;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HisThread ht = new HisThread();
        FutureTask<Integer> ft = new FutureTask<>(ht);
        Thread thread = new Thread(ft, "有返回值的线程");
        thread.start();
        Integer result = ft.get();
        System.out.println("线程的返回值: " + result);
    }
}
