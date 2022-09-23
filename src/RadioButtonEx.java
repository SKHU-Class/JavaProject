import java.awt.*;
import javax.swing.*;
public class RadioButtonEx extends JFrame { public RadioButtonEx() {
        setTitle("RadioButtonEx"); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); ImageIcon selectedCherryIcon = new ImageIcon(
                "images/selectedCherry.jpg"); ButtonGroup g = new ButtonGroup();
        JRadioButton apple = new JRadioButton("apple"); JRadioButton pear = new JRadioButton("pear"); JRadioButton cherry = new JRadioButton("cherry",
                cherryIcon); cherry.setSelectedIcon(selectedCherryIcon); cherry.setBorderPainted(true);
        g.add(apple);
        g.add(pear);
        g.add(cherry);
        c.add(apple);
        c.add(pear);
        c.add(cherry);
        setSize(250, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RadioButtonEx();
    }
}