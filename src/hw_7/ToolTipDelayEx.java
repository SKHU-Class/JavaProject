package hw_7;

import javax.swing.*;
import java.awt.*;

public class ToolTipDelayEx extends JFrame {
    public ToolTipDelayEx() {
        setTitle("ToolTipDelayEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        JLabel cherryLabel = new JLabel(new ImageIcon("images/cherry.jpg"));
        cherryLabel.setToolTipText("체리 이미지입니다."); c.add(cherryLabel);

        JLabel appleLabel = new JLabel(new ImageIcon("images/apple.jpg"));
        appleLabel.setToolTipText("사과 이미지입니다."); c.add(appleLabel);

        ToolTipManager m = ToolTipManager.sharedInstance();

        m.setInitialDelay(0);
        m.setDismissDelay(3000);

        setSize(400, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToolTipDelayEx();
    }
}