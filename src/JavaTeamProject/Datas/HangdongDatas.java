package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class HangdongDatas extends Datas{
    public Pin[] pins = new Pin[]{
            new Pin(0, new Location(695, 183), "항동 철길", "images/TeamProject/Railroad.png", "<html>푸른 수목원 입구에 있습니다. <br> 과거에는 오류동선이라는 이름이었습니다. <br> 화물 수송을 위한 철길이었고 과거에는 기차가 자주 다니던 곳이었지만, 지금은 철길만 남아있습니다.</html>"),
            new Pin(1, new Location(348, 378), "수생식물원", "images/TeamProject/Soosaengsikmoolwon.png", "<html>다양한 수련들을 비롯한 수생식물, 물고기들이 살고 있습니다.<br>민물새우도 살고있습니다.<br>과거 논과 밭이었고, 그 때 사용하던 저수지입니다.</html>"),
            new Pin(2, new Location(391, 402), "습지원", "images/TeamProject/Seupjiwon.png", "<html>우리나라 토종 벼인 붉은차나락, 아롱벼, 보리벼 등 3종이 조성되어 있습니다.<br> 벼가 자라고 익어가는 한해살이 모습을 관찰할 수 있습니다.</html>"),
            new Pin(3, new Location(469, 301), "계류원", "images/TeamProject/Gyeryuwon.png", "<html>수목원 조성 전부터 있던 물길을 그대로 재현한 곳으로, 다양한 수생식물들이 살아가고 있습니다.</html>"),
            new Pin(4, new Location(587, 247), "활엽수원", "images/TeamProject/Hwalyeopsoowon.png", "<html>단풍나무, 참나무, 벚나무처럼 단풍이 아름다운 수종이 많아 가을에는 곱게 단풍을 감상할 수 있는 정원입니다.</html>"),
            new Pin(5, new Location(701, 108), "KB 숲교육센터", "images/TeamProject/KB_EducateCenter.jpg", "<html>수목원의 가장 안쪽에 있습니다.<br>온실로 열대식물들 심어져 있습니다. <br>다양한 대면 프로그램 있고, 봉사활동도 가능합니다.</html>"),
    };

    public void initPins(Container container) {
        setArrowListener(pins);
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
