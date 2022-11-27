package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class OnsuDatas extends Datas{
    public Pin[] pins = new Pin[]{
            new Pin(new Location(281, 326),
                    "커피베이 온수역점",
                    "images/TeamProject/coffeebay.png",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(215, 366),
                    "파리바케뜨 온수역점",
                    "images/TeamProject/paris.png",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(136, 344),
                    "메가MGC커피 온수역점",
                    "images/TeamProject/mega.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(75, 344),
                    "백가부대찌개",
                    "images/TeamProject/baek.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(94, 412),
                    "가마치통닭",
                    "images/TeamProject/gamachi.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(105, 346),
                    "개성진순대 온수역점",
                    "images/TeamProject/sundae.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(108, 453),
                    "고바우",
                    "images/TeamProject/gobawoo.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(595, 471),
                    "둘둘치킨 온수역점",
                    "images/TeamProject/twotwo.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(651, 453),
                    "파리바게뜨 온수역남부점",
                    "images/TeamProject/parisSouth.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(548, 447),
                    "착한쌈싸 본점",
                    "images/TeamProject/ssamssa.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(506, 440),
                    "터프네이모",
                    "images/TeamProject/tough.png",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(524, 464),
                    "썬더치킨",
                    "images/TeamProject/thunder.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(533, 433),
                    "학사마을",
                    "images/TeamProject/haksa.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(619, 464),
                    "봉구비어",
                    "images/TeamProject/bongu.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(610, 488),
                    "냉삼집",
                    "images/TeamProject/nengsam.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(843, 348),
                    "조마루감자탕 온수점",
                    "images/TeamProject/jomaroo.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(851, 384),
                    "뚜레쥬르 온수역남부점",
                    "images/TeamProject/tous.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(697, 460),
                    "의정부 부대찌개",
                    "images/TeamProject/budae.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),
            new Pin(new Location(681, 454),
                    "친구야호프",
                    "images/TeamProject/hope.jpg",
                    "<html>맛있는 우가본3 어쩌구 입니다.</html>"),

            // 꼼사모, 카페 에베르, 자갈치 수산
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
