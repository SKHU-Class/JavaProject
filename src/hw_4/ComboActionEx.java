package hw_4;

import javax.swing.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
    private String[] fruits= {"apple", "banana", "kiwi", "mango"}; private ImageIcon[] images = {
            new ImageIcon("images/apple.jpg"),
            new ImageIcon("images/banana.jpg"),
            new ImageIcon("images/kiwi.jpg"),
            new ImageIcon("images/mango.jpg")
    };
    private JLabel la = new JLabel(images[0]);
    private JComboBox<String> strCombo = new JComboBox<>(fruits);
    public ComboActionEx() {
        setTitle("ComboActionEx"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(strCombo);
        c.add(la);
        strCombo.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource(); int index = cb.getSelectedIndex(); la.setIcon(images[index]);
        });
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ComboActionEx();
    }
}
