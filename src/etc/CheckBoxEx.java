package etc;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx() {
        setTitle("etc.CheckBoxEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        Image cherryImg = cherryIcon.getImage();
        cherryImg = cherryImg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        cherryIcon = new ImageIcon(cherryImg);

        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
        Image selectedCherryImg = selectedCherryIcon.getImage();
        selectedCherryImg = selectedCherryImg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        selectedCherryIcon = new ImageIcon(selectedCherryImg);

        JCheckBox apple = new JCheckBox("apple");
        JCheckBox pear = new JCheckBox("pear");
        JCheckBox cherry = new JCheckBox("cherry", cherryIcon);

        cherry.setSize(60, 60);
        cherry.setSelectedIcon(selectedCherryIcon);
        cherry.setBorderPainted(true);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
