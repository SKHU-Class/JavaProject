package hw_5;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawImageEx1() {
        setTitle("GraphicsDrawImageEx1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(300, 420);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image image = icon.getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 20, 20, this);
        }
    }

    public static void main(String[] args) {
        new GraphicsDrawImageEx1();
    }
}
