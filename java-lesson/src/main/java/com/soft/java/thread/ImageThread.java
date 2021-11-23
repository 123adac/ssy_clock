package com.soft.java.thread;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageThread implements Runnable {
    private JLabel imageLabel;

    private static List<String> imageList = new ArrayList<>(
            Arrays.asList(
                    "https://wallet-manager.oss-cn-hangzhou.aliyuncs.com/avatar/default_avatar.png",
                    "https://cdn.jsdelivr.net/gh/123adac/Picx1@master/20211123/OIP-C.jpg"
            )
    );

    public ImageThread(JLabel imageLabel) {
        this.imageLabel = imageLabel;
    }

    @Override
    public void run() {
        for (int i = 0; i < imageList.size(); i++) {
            Icon icon = null;

            try {
                icon = new ImageIcon(new URL(imageList.get(i)));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            imageLabel.setIcon(icon);
            imageLabel.repaint();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
