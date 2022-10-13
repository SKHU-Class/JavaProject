package hw_5;

import javax.swing.*;
import java.awt.*;

public class paintPanelEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public paintPanelEx() {
        setTitle("PaintPanelEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(panel);

        setSize(250, 200);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawRect(10, 10, 50, 30);
            g.drawRect(50, 30, 50, 30);

            g.setColor(Color.MAGENTA);
            g.drawRect(90, 50, 50, 30);
        }
    }

    public static void main(String[] args) {
        new paintPanelEx();
    }
}
