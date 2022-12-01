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
            new Pin(6, new Location(294, 194), "달록뜰", "images/TeamProject/roseGarden.jpg",
                    "<html>다양한 색을 띠는달록뜰은 흔히 장미원이라 불리는데 장미의 꽃과 잎 모양을 딴 부지에 69종의 장미를 심은 곳으로, 푸른수목원의 대표 정원입니다.<br>"
                            + "계절마다피는 장미는 꽃의 여왕이라고불리는데, 수목원에서도 그 아름다움과 자태를 여실히 보여주고 있으며, 항상 화려한 자태를 뽐내고 있습니다.</html>"),

            new Pin(8, new Location(372, 325), "한울터", "images/TeamProject/urbanGarden.jpg",
                    "<html>정이 가득한 울타리라는 뜻의 한울터는 도시농업의 재배뿐만 아니라 식물의 생태 전반에 걸친 증식과 육종을 관찰하고 원예 활동을 체험하며 식물과 시민들이 교감할 수 있는 공간입니다.<br>"
                            + "도시농업에 대해 관심이 있는 사람들은 누구든 쉽게 농업과 관련한 활동을 실제로 해 볼 수 있도록 조성하였습니다.</html>"),

            new Pin(11, new Location(571, 310), "너울마당", "images/TeamProject/mazeGarden.jpg",
                    "<html>큰 파도가 치는 듯한 모습의 너울마당은 세균 번식을 억제하고 심신을 편안하게 하는 피톤치드의 향이 그윽한 서양측백나무를 주로 심었고, 아이들의 모험심과 호기심을 자극할 수 있도록 원형의 미로를 두었습니다.<br>"
                            + "일 년 내내 초록을 즐길 수 있도록 상록수를 많이 심었으며, 한없이 거닐다 잠깐 즐길 수 있는 모험의 공간이기도 합니다.</html>"),

            new Pin(12, new Location(270, 471), "푸른뜨락", "images/TeamProject/grassSquare.jpg",
                    "<html>다양하게 활용할 수 있는 푸른뜨락은 드넓은 마당을 닮아 시원한 호수처럼 느껴지며 가을철에는 갈대의 정취를 느낄 수 있는, 푸른수목원의 허파와 같은 곳입니다.<br>"
                            + "기존 잔디광장과는 달리 친환경적으로 조성되었으며, 빗물을 여과하는 역할을 하는 곳이기도 합니다.</html>"),

            new Pin(14, new Location(367, 485), "향기원", "images/TeamProject/herbGarden.jpg",
                    "<html>꽃 향기와 흙냄새가 가득한 향기원은 오감을 만족시키는 다양한 종류의 허브, 약용 또는 식용식물 등으로 식물의 신비감을 한층 더 높인 곳입니다.<br>"
                            + "자원봉사자들의 참여와 정성이 모여 조성되었으며 앞으로도 식물을 직접 심고 가꾸는 많은 시민의 손길이 닿을 우리 모두의 정원입니다.</html>"),

            new Pin(15, new Location(544, 334), "야생화원", "images/TeamProject/wildFowersGarden.jpg",
                    "<html>자연스러운 경관을 표현한 야생화원은 드넓은 초지에핀 야생화 무리를 떠올리게 하는 정원으로 한반도에 자생하는 식물을 섞어 심고 무리로 심어 계절마다 꽃이 우아한 자태를 뿜내는 장소입니다.<br>"
                            + "우리나라에 자생하는 식물들을 한자리에서 감상할 수 있도록 조성한 곳입니다.</html>"),
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
