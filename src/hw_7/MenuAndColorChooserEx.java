package hw_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndColorChooserEx extends JFrame {
    private JLabel la = new JLabel("Hello");

    public MenuAndColorChooserEx() {
        setTitle("MenuAndColorChooserEx");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        createMenu();
        la.setHorizontalAlignment(SwingConstants.CENTER);
        la.setFont(new Font("Consolas", Font.ITALIC, 30));
        c.add(la, BorderLayout.CENTER);
        setSize(250, 200);
        setVisible(true);
    }

    private void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu textMenu = new JMenu("Text");
        JMenuItem colorMenuItem = new JMenuItem("Color");
        colorMenuItem.addActionListener(new MenuActionListener());
        textMenu.add(colorMenuItem);
        mb.add(textMenu);
        this.setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("Color")) {
                Color selectedColor = JColorChooser.showDialog(null, "Color", la.getForeground());
                if (selectedColor != null)
                    la.setForeground(selectedColor);
            }
        }
    }

    public static void main(String[] args) {
        new MenuAndColorChooserEx();
    }
}