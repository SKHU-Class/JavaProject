package JavaTeamProject.CustomComponent;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
    public CustomLabel(int x, int y, int width, int height, String text) {
        this.setText(text);
        this.setBounds(x, y, width, height);
    }

    public CustomLabel setFont(String name, int size) {
        this.setFont(new Font(name, Font.BOLD, size));
        return this;
    }

    public CustomLabel setAlignment(int alignment) {
        this.setHorizontalAlignment(alignment);
        return this;
    }

    public CustomLabel setColor(Color color) {
        this.setForeground(color);
        return this;
    }

    public CustomLabel setBackgroundColor(Color color) {
        this.setBackground(color);
        return this;
    }

    public CustomLabel setOpaqueValue(boolean bool) {
        this.setOpaque(bool);
        return this;
    }
}
