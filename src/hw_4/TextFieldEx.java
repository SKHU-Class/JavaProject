package hw_4;

import java.awt.*;
import javax.swing.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx() {

        setTitle("TextFieldEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 "));
        c.add(new JTextField(20));
        c.add(new JLabel("학교 "));
        c.add(new JTextField("성공회대학교", 20));
        c.add(new JLabel("주소 "));
        c.add(new JTextField("서울 구로구 연동로 320", 20));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
