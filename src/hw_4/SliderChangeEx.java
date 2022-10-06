package hw_4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderChangeEx extends JFrame {
    private JLabel la = new JLabel("    COLORED LABEL    ");
    private JSlider[] sl = new JSlider[3];

    public SliderChangeEx() {
        setTitle("SliderChangeEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        for (int i = 0; i < sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            sl[i].setPaintTicks(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            sl[i].setPaintTicks(true);
            sl[i].setPaintLabels(true);
            sl[i].addChangeListener(new MyListener());
            c.add(sl[i]);
        }

        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);

        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();
        la.setOpaque(true);
        la.setBackground(new Color(r, g, b));
        c.add(la);

        setSize(300, 250);
        setVisible(true);
    }
    class MyListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            la.setBackground(new Color(r, g, b));
        }
    }
    public static void main(String[] args) {
        new SliderChangeEx();
    }
}
