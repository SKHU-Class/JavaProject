package hw_7;


import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
    private Container contentPane; public ToolTipEx() {
        setTitle("ToolTipEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = this.getContentPane();
        createToolBar();
        setSize(400, 200);
        setVisible(true);
    }
    private void createToolBar() {
        JToolBar toolBar = new JToolBar("툴바 메뉴");
        toolBar.setBackground(Color.LIGHT_GRAY);
        JButton newBtn = new JButton("New");
        newBtn.setToolTipText("파일을 생성합니다."); toolBar.add(newBtn);
        JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
        openBtn.setToolTipText("파일을 엽니다.");
        toolBar.add(openBtn);
        JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
        saveBtn.setToolTipText("파일을 저장합니다.");
        toolBar.add(saveBtn);
        toolBar.add(new JLabel("검색"));
        JTextField tf = new JTextField("검색할 내용을 입력하세요.");
        tf.setToolTipText("입력한 내용을 검색합니다."); toolBar.add(tf);
        contentPane.add(toolBar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ToolTipEx();
    }
}