package com.soft.java.thread;

public class SellTicketTest3 {
    public static void main(String[] args) {
        TicketWindow3 tw = new TicketWindow3();

        for (int i = 0; i < 3; i++) {
            Thread t = new Thread(tw, "窗口" + i);
            t.start();
        }
    }
}

class TicketWindow3 implements Runnable {
    private static int ticket = 30;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，当前票数为: " + --ticket);
                } else {
                    System.out.println(Thread.currentThread().getName() + "余票不足，无法售票！");
                    break;
                }
            }
        }
    }
}
