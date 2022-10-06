package hw_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(20);
    private Vector<String> v = new Vector<>();
    private JList<String> nameList = new JList<>(v);

    public ListChangeEx() {
        setTitle("ListChangeEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름을 입력한 후 <Enter>키를 입력하세요"));
        c.add(tf);

        v.add("김느티");
        v.add("이아래");
        nameList.setFixedCellWidth(100);
        nameList.setVisibleRowCount(5);
        c.add(new JScrollPane(nameList));

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField) e.getSource();
                v.add(t.getText());
                t.setText("");
                nameList.setListData(v);
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListChangeEx();
    }
}
