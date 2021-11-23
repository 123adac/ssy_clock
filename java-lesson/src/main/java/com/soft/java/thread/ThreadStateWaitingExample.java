package com.soft.java.thread;

public class ThreadStateWaitingExample {
    private static final Object LOCKER = new Object();

    public static void main(String[] args) {
        Runnable waiting = () -> {
            System.out.println("whoWillWait 开始等待 whoWillNotify");
            waiting();
            System.out.println("whoWillWait 等到了 whoWillNotify 的通知");
        };

        Thread whoWillWait = new Thread(waiting);
        whoWillWait.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("whoWillWait 当前的线程状态=" + whoWillWait.getState());

        Runnable notify = () -> {
            System.out.println("whoWillNotify 准备通知 whoWillWait");
            notifying();
        };

        Thread whoWillNotify = new Thread(notify);
        whoWillNotify.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("唤醒后，whoWillWait当前的线程状态=" + whoWillWait.getState());
        System.exit(1);
    }

    private static void waiting() {
        synchronized (LOCKER) {
            try {
                LOCKER.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void notifying() {
        synchronized (LOCKER) {
            LOCKER.notify();
            System.out.println("whoWillNotify 已经通知，即将离开同步代码块");
        }
    }
}
