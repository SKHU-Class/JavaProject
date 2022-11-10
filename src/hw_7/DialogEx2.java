package hw_7;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyModalDialog extends JDialog {
    private JTextField tf = new JTextField(10);
    private JButton okBtn = new JButton("OK");

    public MyModalDialog(JFrame frame, String title) {
        super(frame, title, true);
        setLayout(new FlowLayout());
        setSize(200, 100);
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        this.add(tf);
        this.add(okBtn);
    }

    public String getInput() {
        if (tf.getText().length() == 0) return null;
        return tf.getText();
    }
}

public class DialogEx2 extends JFrame {
    private MyModalDialog dialog;

    public DialogEx2() {
        super("DialogEx2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        dialog = new MyModalDialog(this, "Test Modal Dialog");
        JButton btn = new JButton("Show Modal Dialog");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                String text = dialog.getInput();
                if (text == null) return;
                JButton btn = (JButton) e.getSource();
                btn.setText(text);
            }
        });
        c.add(btn);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogEx2();
    }
}