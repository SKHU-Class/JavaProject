package hw_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
    private Container c;
    private boolean flag = false;

    public RandomThread(Container c) {
        this.c = c;
    }

    public void finish() {
        flag = true;
    }

    @Override
    public void run() {
        while (true) {
            int x = ((int) (Math.random() * c.getWidth()));
            int y = ((int) (Math.random() * c.getHeight()));
            JLabel label = new JLabel("Java");
            label.setSize(80, 30);
            label.setLocation(x, y);
            c.add(label);
            c.repaint();
            try {
                Thread.sleep(300);
                if (flag == true) {
                    c.removeAll();
                    label = new JLabel("finish");
                    label.setSize(80, 30);
                    label.setLocation(100, 100);
                    label.setForeground(Color.RED);
                    c.add(label);
                    c.repaint();
                    return;
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

public class ThreadFinishFlagEx extends JFrame {
    private RandomThread th;

    public ThreadFinishFlagEx() {
        setTitle("ThreadFinishFlagEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                th.finish();
            }
        });
        setSize(300, 200);
        setVisible(true);
        th = new RandomThread(c);
        th.start();
    }

    public static void main(String[] args) {
        new ThreadFinishFlagEx();
    }
}