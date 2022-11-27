package JavaTeamProject.CustomComponent;

import JavaTeamProject.Datas.Datas;
import JavaTeamProject.DetailView.ButtonStatus;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    public CustomButton cancelBtn = new CustomButton("", "images/TeamProject/cancel.png", 820, 90, 32, 32);

    public CustomPanel(int x, int y, int width, int height, Color color) {
        this.setLayout(null);
        this.setBounds(x, y, width, height);
        this.setBackground(color);

        this.add(cancelBtn);

        cancelBtn.addActionListener(e -> {
            this.setVisible(false);
        });
    }

    public CustomPanel visible(boolean bool) {
        this.setVisible(bool);
        return this;
    }

    public void setAction(ButtonStatus buttonStatus, Datas pinData) {
        cancelBtn.addActionListener(e -> {
            pinData.visiblePins(false);
            buttonStatus.setButtonStatus(true);
        });
    }
}
