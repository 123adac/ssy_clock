package com.soft.java.thread;


public class ThreadStateRunnableExample {
    private static boolean flag = true;

    public static void main(String[] args) {
        Runnable waiting = () -> {
            do {

            } while (flag);
        };

        Thread thread = new Thread(waiting);
        thread.start();

        try {
            Thread.sleep(1000);
            System.out.println(thread.getState());
            flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(1);
    }
}
