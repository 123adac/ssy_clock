package com.soft.java.thread;

public class ThreadStateTimeWaitingExample {
    private static final Object LOCKER = new Object();

    public static void main(String[] args) {
        Runnable waiting = () -> {
            System.out.println("whoWillWait 开始等待 1秒钟");
            waiting();
            System.out.println("whoWillWait 等待结束");
        };

        Thread whoWillWait = new Thread(waiting);
        whoWillWait.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("whoWillWait当前的线程状态=" + whoWillWait.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("whoWillWait当前的线程状态=" + whoWillWait.getState());
        System.exit(1);
    }

    private static void waiting() {
        synchronized (LOCKER) {
            try {
                LOCKER.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
