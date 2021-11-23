package com.soft.java.thread;


import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class NumberThread implements Runnable {
    private final JLabel numberLabel;

    public NumberThread(JLabel numberLabel) {
        this.numberLabel = numberLabel;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            numberLabel.setText(String.valueOf(random.nextInt(100)));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
