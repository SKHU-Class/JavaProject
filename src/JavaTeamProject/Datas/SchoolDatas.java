package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class SchoolDatas extends Datas{
    public Pin[] pins = new Pin[]{
        new Pin(new Location(100, 100), ""),
        new Pin(new Location(200, 200), ""),
        new Pin(new Location(300, 300), ""),
        new Pin(new Location(400, 400), ""),
        new Pin(new Location(500, 500), ""),
    };

    public void initPins(Container container) {
        for (Pin pin: pins) {
            CustomImage image =
                    new CustomImage(pin.location.x, pin.location.y, 24, 24, "images/TeamProject/pin.png")
                            .visible(false);

            pinImages.add(image);
            setMouseListener(image);
            container.add(image);
        }
    }
}
