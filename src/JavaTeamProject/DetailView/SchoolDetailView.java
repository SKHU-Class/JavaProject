package JavaTeamProject.DetailView;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.CustomComponent.CustomPanel;

import java.awt.*;

public class SchoolDetailView extends CustomPanel {
    CustomImage schoolDetailImg = new CustomImage(0, 0, 947, 740, "images/TeamProject/schoolDetail.png");
    public SchoolDetailView() {
        super(0, -5, 947, 740, new Color(0, 0, 0, 0));
        this.visible(false);

        setUI();
    }

    public void setUI() {
        this.add(schoolDetailImg);
    }
}
