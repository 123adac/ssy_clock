package com.soft.java.thread;

public class YourThread implements Runnable {
    private final String threadName;

    public YourThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);

        try {
            for (int i =  5; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread: " + threadName + " exited");
    }

    public static void main(String[] args) {
        YourThread yourThread = new YourThread("hello");
        Thread thread1 = new Thread(yourThread);
        Thread thread2 = new Thread(yourThread);
        Thread thread3 = new Thread(yourThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}