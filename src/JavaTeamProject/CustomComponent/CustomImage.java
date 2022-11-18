package JavaTeamProject.CustomComponent;
import javax.swing.*;
import java.awt.*;

public class CustomImage extends JLabel {
    public CustomImage(int width, int height, String filename) {
        ImageIcon icon = new ImageIcon(filename);
        this.setIcon(icon);
        this.setBounds(0, 0, width, height);
    }
    public CustomImage(int x, int y, int width, int height, String filename) {
        ImageIcon icon = new ImageIcon(filename);
        this.setIcon(icon);
        this.setBounds(x, y, width, height);
    }

    public CustomImage setColor(Color color) {
        this.setForeground(color);
        return this;
    }

    public CustomImage setBackgroundColor(Color color) {
        this.setBackground(color);
        return this;
    }

    public CustomImage visible(boolean bool) {
        this.setVisible(bool);
        return this;
    }
}


