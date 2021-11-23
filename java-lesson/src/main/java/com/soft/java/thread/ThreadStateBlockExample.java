package com.soft.java.thread;

public class ThreadStateBlockExample {
    private static final boolean LOCK_FLAG = true;

    public static void main(String[] args) {
        Runnable locker = ThreadStateBlockExample::locker;

        Thread whoWillLockOthers = new Thread(locker);

        whoWillLockOthers.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread whoWillBeLocked = new Thread(locker);

        whoWillBeLocked.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("whoWillBeLocked 线程的当前状态为=" + whoWillBeLocked.getState() + "");
        System.exit(1);
    }

    private static void locker() {
        do {

        } while (LOCK_FLAG);
    }
}