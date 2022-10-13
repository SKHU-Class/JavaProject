package hw_5;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawStringEx() {
        setTitle("GraphicsDrawStringEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(250, 220);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.drawString("Java is so funny!", 30, 30);
            g.drawString("What?!", 60, 60);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawStringEx();
    }
}
