package etc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private final String[] names = {"사과", "배", "체리"};
    private JLabel sumLabel;
    public CheckBoxItemEventEx() {
        setTitle("etc.CheckBoxItemEventEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 2000원, 배 3000원, 체리 5000원"));

        MyItemListener listener = new MyItemListener();
        for(int i=0; i<fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재 0원 입니다.");
        c.add(sumLabel);

        setSize(250, 150);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;

        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED) {
                if(e.getItem() == fruits[0])
                    sum += 2000;
                else if(e.getItem() == fruits[1])
                    sum += 3000;
                else if(e.getItem() == fruits[2])
                    sum += 5000;
            }
            else {
                if(e.getItem() == fruits[0])
                    sum -= 2000;
                else if(e.getItem() == fruits[1])
                    sum -= 3000;
                else if(e.getItem() == fruits[2])
                    sum -= 5000;
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        new CheckBoxItemEventEx();
    }
}
