package hw_5;

import javax.swing.*;
import java.awt.*;

public class paintJButtonEx extends JFrame{

    public paintJButtonEx() {
        setTitle("PaintPanelEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        MyButton b = new MyButton("MyButton");
        b.setOpaque(true);
        b.setBackground(Color.CYAN);
        c.add(b);

        setSize(250, 200);
        setVisible(true);
    }

    class MyButton extends JButton {
        public MyButton(String s) {
            super(s);
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
        }
    }

    public static void main(String[] args) {
        new paintJButtonEx();
    }
}
