package JavaTeamProject.DetailView;

import JavaTeamProject.CustomComponent.CustomButton;
import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.CustomComponent.CustomPanel;

import java.awt.*;
import java.util.function.Function;

public class OnsuDetailView extends CustomPanel {
    CustomImage onsuDetailImg = new CustomImage(0, 0, 947, 740, "images/TeamProject/onsuDetail.png");
    CustomButton cancelBtn = new CustomButton("", "images/TeamProject/cancel.png", 820, 90, 32, 32);
    public OnsuDetailView() {
        super(0, -5, 947, 740, new Color(0, 0, 0, 0));
        this.visible(false);

        setUI();
    }

    public void setUI() {
        this.add(cancelBtn);
        this.add(onsuDetailImg);
    }

    public void setAction(ButtonStatus buttonStatus) {
        cancelBtn.addActionListener(e -> {
            this.visible(false);
            buttonStatus.setButtonStatus(true);
        });
    }
}
