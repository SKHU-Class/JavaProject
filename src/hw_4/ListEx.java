package hw_4;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    public ListEx() {
        setTitle("ListEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        String [] fruits = {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};

        JList<String> strList = new JList<>(fruits);
        c.add(strList);

        JList<String> strList2 = new JList<>(fruits);
        c.add(new JScrollPane(strList2));

        ImageIcon [] images = {
                new ImageIcon("images/icon1.png"),
                new ImageIcon("images/icon2.png"),
                new ImageIcon("images/icon3.png"),
                new ImageIcon("images/icon4.png")
        };
        JList<ImageIcon> imageList = new JList<>();
        imageList.setListData(images);
        c.add(imageList);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListEx();
    }
}
