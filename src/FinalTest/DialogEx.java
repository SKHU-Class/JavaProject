package FinalTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDialog extends JDialog {
    private JTextField tf = new JTextField(10);
    private JButton okBtn = new JButton("OK");

    public MyDialog(JFrame frame, String title) {
        super(frame, title, false);
        setLayout(new FlowLayout());
        setSize(200, 200);
        okBtn.addActionListener(new ActionListener() {
            @Override
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

public class DialogEx extends JFrame {
    private MyDialog dialog;

    public DialogEx() {
        super("DialogEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        dialog = new MyDialog(this, "Test Dialog");
        JButton btn = new JButton("Show Dialog");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
                String text = dialog.getInput();
                if(text == null) return;
                JButton btn = (JButton) e.getSource();
                btn.setText(text);
            }
        });

        c.add(btn);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DialogEx();
    }
}
