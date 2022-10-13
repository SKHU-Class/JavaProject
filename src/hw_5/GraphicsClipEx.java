package hw_5;

import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsClipEx() {
        setTitle("GraphicsDrawImageEx1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);

        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image image = icon.getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setClip(100, 20, 150, 150);
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.ITALIC, 40));
            g.drawString("Let's go !", 10, 150);
        }
    }

    public static void main(String[] args) {
        new GraphicsClipEx();
    }
}
