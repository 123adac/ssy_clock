package com.soft.java.thread;

public class ThreadStateTerminatedExample {
    public static void main(String[] args) {
        Runnable waiting = () -> {
            System.out.println("随便执行以下，然后线程就会变为Terminated");
        };

        Thread terminate = new Thread(waiting);
        terminate.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("terminate当前的线程状态=" + terminate.getState());
        System.exit(1);
    }
}
