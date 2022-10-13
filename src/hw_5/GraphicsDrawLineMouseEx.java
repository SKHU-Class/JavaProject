package hw_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class GraphicsDrawLineMouseEx extends JFrame {
    private MyPanel panel = new MyPanel();

    public GraphicsDrawLineMouseEx() {
        setTitle("GraphicsDrawLineMouseEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(300, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        private Vector<Point> vStart = new Vector<>();
        private Vector<Point> vEnd = new Vector<Point>();

        public MyPanel() {
            this.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    vStart.add(e.getPoint());
                }

                public void mouseReleased(MouseEvent e) {
                    vEnd.add(e.getPoint());
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < vStart.size(); i++) {
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);
                g.drawLine((int) s.getX(), (int) s.getY(),
                        (int) e.getX(), (int) e.getY());
            }
        }
    }
    public static void main(String[] args) {
        new GraphicsDrawLineMouseEx();
    }
}
