package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class HangdongDatas extends Datas{
    public Pin[] pins = new Pin[]{
        new Pin(new Location(100, 100), "우가본", "images/TeamProject/MainMap.png", "<html>맛있는 우가본 어쩌구 입니다.</html>"),
        new Pin(new Location(200, 200), "우가본2", "images/TeamProject/MainMap.png", "<html>맛있는 우가본2 어쩌구 입니다.</html>"),
        new Pin(new Location(300, 300), "우가본3", "images/TeamProject/MainMap.png", "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
    };

    public void initPins(Container container) {
        for (Pin pin: pins) {
            CustomImage image =
                    new CustomImage(pin.location.x, pin.location.y, 24, 24, "images/TeamProject/pin.png")
                            .visible(false);

            pinImages.add(image);
            setMouseListener(image, pin);
            container.add(image);
        }
    }
}
