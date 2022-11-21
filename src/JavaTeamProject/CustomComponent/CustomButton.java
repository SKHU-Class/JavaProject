package JavaTeamProject.CustomComponent;

import JavaTeamProject.DetailView.ButtonStatus;

import javax.swing.*;

public class CustomButton extends JButton {
    public CustomButton(String text, int width, int height) {
        this.setText(text);
        this.setSize(width, height);
    }
    public CustomButton(String text, String filename, int x, int y, int width, int height) {
        this.setText(text);
        this.setIcon(new ImageIcon(filename));
        this.setBounds(x, y, width, height);
    }
}
