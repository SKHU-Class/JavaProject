package JavaTeamProject.DetailView;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.CustomComponent.CustomPanel;

import java.awt.*;

public class HangdongDetailView extends CustomPanel {
    CustomImage onsuDetailImg = new CustomImage(0, 0, 947, 740, "images/TeamProject/onsuDetail.png");
    public HangdongDetailView() {
        super(0, -5, 947, 740, new Color(0, 0, 0, 0));
        this.visible(false);

        setUI();
    }

    public void setUI() {
        this.add(onsuDetailImg);
    }
}
