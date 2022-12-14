package hw_5;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
    private MyPanel panel = new MyPanel();

    GraphicsDrawLineEx() {
        setTitle("GraphicsDrawLineEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(200, 200);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawLine(20, 20, 100, 100);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawLineEx();
    }
}
