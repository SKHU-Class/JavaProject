package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomButton;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class OnsuDatas {
    public Pin[] pins = new Pin[]{
        new Pin(new Location(100, 100), ""),
        new Pin(new Location(200, 200), ""),
        new Pin(new Location(300, 300), ""),
        new Pin(new Location(400, 400), ""),
        new Pin(new Location(500, 500), ""),
    };

    public void initPins(Container container) {
        for (Pin pin: pins) {
            container.add(
                new CustomButton(pin.description, "images/TeamProject/pin.png", pin.location.x, pin.location.y, 24, 24)
                    .setOpaque(), 0);
        }
    }
}
