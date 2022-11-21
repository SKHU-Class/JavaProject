package JavaTeamProject.CustomComponent;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    public CustomPanel(int x, int y, int width, int height, Color color) {
        this.setLayout(null);
        this.setBounds(x, y, width, height);
        this.setBackground(color);
    }

    public CustomPanel visible(boolean bool) {
        this.setVisible(bool);
        return this;
    }
}
