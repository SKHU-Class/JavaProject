package etc;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    public ButtonEx() {
        setTitle("etc.ButtonEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("images/etc/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("images/etc/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("images/etc/pressedIcon.gif");

        JButton btn = new JButton("call", normalIcon);
        btn.setRolloverIcon(rolloverIcon);
        btn.setPressedIcon(pressedIcon);
        c.add(btn);

        setSize(250, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ButtonEx();
    }
}
