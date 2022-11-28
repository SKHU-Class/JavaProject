package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.Model.Location;
import JavaTeamProject.Model.Pin;

import java.awt.*;

public class OnsuDatas extends Datas{
    public Pin[] pins = new Pin[]{
            new Pin(0, new Location(281, 326),
                    "커피베이 온수역점",
                    "images/TeamProject/coffeebay.png",
                    "<html>커피가 맛있는 곳이다. 커피베이보다는 스타벅스가 좋다. 왜냐하면 아메리카노가 더 맛있기 떄문이다.</html>"),
            new Pin(1, new Location(215, 366),
                    "파리바게뜨 온수역점",
                    "images/TeamProject/paris.png",
                    "<html>파리바게뜨 온수역점이다. 빵은 탄수화물이다. 살이 많이 찌니 적당히 먹자. 나는 소세지빵을 제일 좋아한다.</html>"),
            new Pin(2, new Location(136, 344),
                    "메가MGC커피 온수역점",
                    "images/TeamProject/mega.jpg",
                    "<html>메카MGC커피다. MGC는 메가커피의 줄임말이다. 메가커피는 아메리카노가 1500원으로 정말 싸다.</html>"),
            new Pin(3, new Location(75, 344),
                    "백가부대찌개",
                    "images/TeamProject/baek.jpg",
                    "<html>백가부대찌개 집이다. 대표 메뉴인 부대찌개도 맛있지만 순두부찌나 돈까스도 맛있다. 테이블은 10개 정도 있다.</html>"),
            new Pin(4, new Location(94, 412),
                    "가마치통닭",
                    "images/TeamProject/gamachi.jpg",
                    "<html>가마치통닭 집이다. 옛날 통닭을 파는 곳이며 통닭 한 마리에 8000원으로 매우 싼 편에 속한다.</html>"),
            new Pin(5, new Location(105, 346),
                    "개성진순대 온수역점",
                    "images/TeamProject/sundae.jpg",
                    "<html>개성진순대 집이다. 순대국이 맛있는 집이다. 예전에 한 번 갔을 땐 '순대국에 순대빼고 주세요~' 하는 사람을 본 적이 있다.</html>"),
            new Pin(6, new Location(108, 453),
                    "고바우",
                    "images/TeamProject/gobawoo.jpg",
                    "<html>고바우 집이다. 옛추억이 떠오르는 연탄불에 구워먹는 주먹고기집이다. 덩어리 생고기는 12,000원으로 책정 되어있다.</html>"),
            new Pin(7, new Location(595, 471),
                    "둘둘치킨 온수역점",
                    "images/TeamProject/twotwo.jpg",
                    "<html>둘둘치킨 온수역점이다. 둘둘치킨은 100% 국내산 신선육을 가장 신선한 야채들과 염지하여 살 속까지 양념이 베인 속살까지 맛있는 건강한 치킨이다.</html>"),
            new Pin(8, new Location(651, 453),
                    "파리바게뜨 온수역남부점",
                    "images/TeamProject/parisSouth.jpg",
                    "<html>파리바게뜨 온수역남부점이다. 빵은 탄수화물이다. 살이 많이 찌니 적당히 먹자. 역시나 나는 소세지빵을 제일 좋아한다.</html>"),
            new Pin(9, new Location(548, 447),
                    "착한쌈싸 본점",
                    "images/TeamProject/ssamssa.jpg",
                    "<html>착한쌈싸 본점이다. 점심 특선 제육쌈밥이 10,000원에 책정 되어있다. 고기는 1인분이 아니라 한판, 반판 단위로 판매하고 있다. </html>"),
            new Pin(10, new Location(506, 440),
                    "터프네이모",
                    "images/TeamProject/tough.png",
                    "<html>터프네이모는 실내 포차집이다. 이모님이 터프해서 터프네 이모이다. 계란말이가 정말 맛있지만 오래걸리기 때문에 이모님은 주문이 들어오는 것을 싫어하신다.</html>"),
            new Pin(11, new Location(524, 464),
                    "썬더치킨",
                    "images/TeamProject/thunder.jpg",
                    "<html>썬더치킨 집이다. 썬더치킨은 체인점인데 모르는 사람이 많은 것 같다. 썬더치킨은 후라이드 반 양념 반이 정말 맛있다. 거기다 반 마리 단위로 시킬 수 있다.</html>"),
            new Pin(12, new Location(533, 433),
                    "학사마을",
                    "images/TeamProject/haksa.jpg",
                    "<html>학사마을은 터프네 바로 옆에 위치한 실내 포차이다. 곱창전골은 8,000원, 낙지볶음은 8,000원으로 가성비가 좋은 편이다.</html>"),
            new Pin(13, new Location(619, 464),
                    "봉구비어",
                    "images/TeamProject/bongu.jpg",
                    "<html>봉구비어 온수역점은 하이트 / 동원푸드 / 세계주류와 함께 합니다. 제휴/제안 대한 내용은 홈페이지(http://www.bonggubeer.net/sponsor)를 통해 상세히 알 수 있습니다..</html>"),
            new Pin(14, new Location(610, 488),
                    "냉삼집",
                    "images/TeamProject/nengsam.jpg",
                    "<html>냉삼집은 냉동 삼겹살 집이다. 특이한 점이 있다면 강릉장칼국를 판매한다는 것이다. 냉동 삼겹살은 200g에 8,900원으로 가성비가 좋은 편이다.</html>"),
            new Pin(15, new Location(843, 348),
                    "조마루감자탕 온수점",
                    "images/TeamProject/jomaroo.jpg",
                    "<html>조마루감자탕 온수점이다. 인터넷에는 해장국이 7,000원이라 나와있지만 실제로는 9,000원 이다. 조금 비싼 감이 있지만 그래도 양이 많고 맛있는 편이다.</html>"),
            new Pin(16, new Location(851, 384),
                    "뚜레쥬르 온수역남부점",
                    "images/TeamProject/tous.jpg",
                    "<html>뚜레쥬르 온수역남부점이다. 빵은 탄수화물이다. 살이 많이 찌니 적당히 먹자. 역시나 나는 소세지빵을 제일 좋아한다. 온수에는 빵집이 3개나 있다.</html>"),
            new Pin(17, new Location(697, 460),
                    "의정부 부대찌개",
                    "images/TeamProject/budae.jpg",
                    "<html>온수역에 위치한 의정부 부대찌개 집이다. 부대찌개는 8,000원에 형성되어 있으며 동태찌개, 된장찌개, 김치찌개 등 여러 찌개 종류가 있다. 밑반찬도 여러가지가 나오는 가성비 좋은 밥집이다.</html>"),
            new Pin(18, new Location(681, 454),
                    "친구야호프",
                    "images/TeamProject/hope.jpg",
                    "<html>친구야호프 집이다. 무난한 술집이며 스페셜 세트 메뉴가 가성비가 매우 좋다. 코스요리처럼 여러가지 메뉴가 나오는데 모두 술과 함께 먹기 좋은 안주들이다.</html>"),

            new Pin(19, new Location(639, 472),
                    "카페에베르",
                    "images/TeamProject/eber.jpg",
                    "<html> <b>카페 에베르</b><hr>"
                    + "#빵만드는카페 #식사가능<br>"
                    + "커리와 돈까스, 샌드위치 등 식사를 할 수 있고 편안하게 작업할 수 있는 카페<br>>"
                    + "주소 : 서울 구로구 경인로 3길 77 (학교에서 도보 10분)<br>"
                    + "전화번호 : 0507-1306-3467<br>"
                    + "영업시간 : 매주 일요일 휴무, 10:00~22:00, 라스트오더-21:15 </html>"),
            new Pin(20, new Location(723, 455),
                    "꼼사모",
                    "images/TeamProject/jangeo.jpg",
                    "<html> <b>꼼사모</b><hr>"
                    + "#꼼장어 #삼겹살 #돼지껍데기<br>"
                    + "숯불로 구워주는 양념꼼장어구이, 돼지막창, 삼겹살을 먹을 수 있다. 양념꼼장어가 2인분에 24000원으로 저렴한 편<br>"
                    + "주소 : 서울 구로구 경인로3길 69 (학교에서 도보 10분)<br>"
                    + "전화번호 : 02-2619-9222 </html>"),
            new Pin(21, new Location(574, 479),
                    "자갈치 수산",
                    "images/TeamProject/susan.jpg",
                    "<html> <b>자갈치 수산</b><hr>"
                    + "#물회 #다양한회와구이찜<br>"
                    + "운영하신지 20년된 횟집. 물회가 유명하며 다 먹은 후 소면을 넣어준다. 회, 무침, 구이, 샤브샤브등 다양하게 해산물을 즐길 수 있다<br>"
                    + "주소 : 서울 구로구 경인로3길 77 세건빌딩 (학교에서 도보 10분)<br>"
                    + "전화번호 : 02-2614-3402<br>"
                    + "영업시간 : 매일 15:00~01:00 </html>"),
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
