package hw_7;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
    private Container contentPane; public ToolBarEx() {
        setTitle("ToolBarEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = this.getContentPane();
        createToolBar();
        setSize(400, 200);
        setVisible(true);
    }
    private void createToolBar() {
        JToolBar toolBar = new JToolBar("툴바 메뉴");
        toolBar.setBackground(Color.LIGHT_GRAY);
        toolBar.add(new JButton("New"));
        toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
        toolBar.addSeparator();
        toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
        toolBar.add(new JLabel("검색"));
        toolBar.add(new JTextField("검색할 내용을 입력하세요."));
        JComboBox<String> combo = new JComboBox<String>(); combo.addItem("Java");
        combo.addItem("C/C++");
        combo.addItem("Python");
        toolBar.add(combo);
        contentPane.add(toolBar, BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        new ToolBarEx();
    }
}
