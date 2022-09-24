package exam;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlueMarble extends JFrame {
    // 32개
    private PosXY[] playerAposition = {
        new PosXY(730, 730),
        new PosXY(640, 730),
        new PosXY(550, 730),
        new PosXY(460, 730),
        new PosXY(370, 730),
        new PosXY(280, 730),
        new PosXY(190, 730),
        new PosXY(100, 730),
        new PosXY(10, 730),
        new PosXY(10, 640),
        new PosXY(10, 550),
        new PosXY(10, 460),
        new PosXY(10, 370),
        new PosXY(10, 280),
        new PosXY(10, 190),
        new PosXY(10, 100),
        new PosXY(10, 10),
        new PosXY(100, 10),
        new PosXY(190, 10),
        new PosXY(280, 10),
        new PosXY(370, 10),
        new PosXY(460, 10),
        new PosXY(550, 10),
        new PosXY(640, 10),
        new PosXY(730, 10),
        new PosXY(730, 100),
        new PosXY(730, 190),
        new PosXY(730, 280),
        new PosXY(730, 370),
        new PosXY(730, 460),
        new PosXY(730, 550),
        new PosXY(730, 640),
    };
    private PosXY[] playerBposition = {
        new PosXY(770, 730),
        new PosXY(680, 730),
        new PosXY(590, 730),
        new PosXY(500, 730),
        new PosXY(410, 730),
        new PosXY(320, 730),
        new PosXY(230, 730),
        new PosXY(140, 730),
        new PosXY(50, 730),
        new PosXY(50, 640),
        new PosXY(50, 550),
        new PosXY(50, 460),
        new PosXY(50, 370),
        new PosXY(50, 280),
        new PosXY(50, 190),
        new PosXY(50, 100),
        new PosXY(50, 10),
        new PosXY(140, 10),
        new PosXY(230, 10),
        new PosXY(320, 10),
        new PosXY(410, 10),
        new PosXY(500, 10),
        new PosXY(590, 10),
        new PosXY(680, 10),
        new PosXY(770, 10),
        new PosXY(770, 100),
        new PosXY(770, 190),
        new PosXY(770, 280),
        new PosXY(770, 370),
        new PosXY(770, 460),
        new PosXY(770, 550),
        new PosXY(770, 640),
    };
    private Country[] eastCountry = {
        new Country("타히티", Color.PINK),
        new Country("런던", Color.ORANGE),
        new Country("영국", Color.ORANGE),
        new Country("CARD", Color.WHITE),
        new Country("뉴욕", Color.RED),
        new Country("국세청", Color.WHITE),
        new Country("서울", Color.RED)
    };

    private Country[] westCountry = {
        new Country("상파울로", new Color(44, 119, 232)),
        new Country("하와이", new Color(111, 233, 237)),
        new Country("퀘벡", new Color(44, 119, 232)),
        new Country("CARD", Color.WHITE),
        new Country("시드니", new Color(54, 158, 214)),
        new Country("도쿄", new Color(54, 158, 214)),
        new Country("발리", Color.PINK),
    };

    private Country[] northCountry = {
        new Country("올림픽", Color.LIGHT_GRAY),
        new Country("프라하", new Color(220, 126, 198)),
        new Country("푸켓", new Color(111, 233, 237)),
        new Country("베를린", new Color(220, 126, 198)),
        new Country("CARD", Color.WHITE),
        new Country("모스크바", new Color(148, 115, 165)),
        new Country("제네바", new Color(148, 115, 165)),
        new Country("로마", new Color(148, 115, 165)),
        new Country("세계여행", Color.WHITE),
    };

    private Country[] southCountry = {
        new Country("무인도", Color.LIGHT_GRAY),
        new Country("카이로", new Color(46, 149, 24)),
        new Country("두바이", new Color(46, 149, 24)),
        new Country("타이페이", new Color(46, 149, 24)),
        new Country("독도", new Color(111, 233, 237)),
        new Country("베이징", new Color(137, 174, 21)),
        new Country("<html>보너스<br/>게임</html>", Color.WHITE),
        new Country("방콕", new Color(137, 174, 21)),
        new Country("START", Color.WHITE)
    };

    // 전역으로 사용해아하는 변수들.
    JLabel rollLabel = new JLabel("주사위를 굴려주세요");
    JButton playerA = new JButton("A");
    JButton playerB = new JButton("B");
    JButton Roll = new JButton("Roll");
    JPanel purchasePopup = new JPanel(null);
    JButton purchaseBtn = new JButton("구매하기");
    int curposA = 0;
    int curposB = 0;
    int moneyA = 1000000;
    int moneyB = 1000000;
    JTextArea boughtACountry = new JTextArea();
    JTextArea boughtBCountry = new JTextArea();
    JLabel description = new JLabel();
    JLabel playerLabel = new JLabel();
    JLabel purchaseName = new JLabel("");
    JLabel moneyALabel = new JLabel("현재 자산: " + moneyA);
    JLabel moneyBLabel = new JLabel("현재 자산: " + moneyB);
    int turn = 0;
    List<String> boughtA = new ArrayList<>();
    List<String> boughtB = new ArrayList<>();
    CountryState[] countryState = new CountryState[]{
            new CountryState(0, "start", "start", 100000),
            new CountryState(1, "방콕","notbuy", 100000),
            new CountryState(2, "보너스게임","game", 100000),
            new CountryState(3, "베이징","notbuy", 100000),
            new CountryState(4, "독도","notbuy", 100000),
            new CountryState(5, "타이페이","notbuy", 100000),
            new CountryState(6, "두바이","notbuy", 100000),
            new CountryState(7, "카이로","notbuy", 100000),
            new CountryState(8, "무인도","island", 100000),
            new CountryState(9, "발리","notbuy", 100000),
            new CountryState(10,"도쿄", "notbuy", 100000),
            new CountryState(11,"시드니", "notbuy", 100000),
            new CountryState(12,"card", "card", 100000),
            new CountryState(13,"퀘벡", "notbuy", 100000),
            new CountryState(14,"하와이", "notbuy", 100000),
            new CountryState(15,"상파울로", "notbuy", 100000),
            new CountryState(16,"올림픽", "olympic", 100000),
            new CountryState(17,"프라하", "notbuy", 100000),
            new CountryState(18,"푸켓", "notbuy", 100000),
            new CountryState(19,"베를린", "notbuy", 100000),
            new CountryState(20,"card", "card", 100000),
            new CountryState(21,"모스크바", "notbuy", 100000),
            new CountryState(22,"제네바", "notbuy", 100000),
            new CountryState(23,"로마", "notbuy", 100000),
            new CountryState(24,"세계여행", "airplane", 100000),
            new CountryState(25,"타히티", "notbuy", 100000),
            new CountryState(26,"런던", "notbuy", 100000),
            new CountryState(27,"영국", "notbuy", 100000),
            new CountryState(28,"card", "card", 100000),
            new CountryState(29,"뉴욕", "notbuy", 100000),
            new CountryState(30,"국세청", "tex", 100000),
            new CountryState(31,"서울", "notbuy", 100000),
    };
    public BlueMarble() {
        setTitle("BlueMarble");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 맨 아래 레이어
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        createPlayer(jPanel);
        createRollBtn(jPanel);
        createRollLabel(jPanel);
        createPlayerAStatus(jPanel);
        createPlayerBStatus(jPanel);
        createPurchasePopup(jPanel);
        gameBoardSetting(jPanel);

        c.add(jPanel);
        setSize(810, 835);
        setVisible(true);
    }

    void createRollBtn(Container panel) {
        panel.add(Roll);
        Roll.setBounds(375, 375, 60, 60);
        RollBtnListener listener = new RollBtnListener();
        Roll.addActionListener(listener);
    }

    void createRollLabel(Container panel) {
        panel.add(rollLabel);
        rollLabel.setHorizontalAlignment(0);
        rollLabel.setBounds(330, 200, 150, 30);
    }

    void createPlayer(Container panel) {
        playerA.setBounds(730, 730, 30, 30);
        playerA.setBackground(Color.GRAY);
        panel.add(playerA);
        panel.setComponentZOrder(playerA, 0);

        playerB.setBounds(770, 730, 30, 30);
        panel.add(playerB);
        panel.setComponentZOrder(playerB, 1);
    }

    void createPlayerAStatus(Container panel) {
        JPanel board = new JPanel(null);
        board.setBackground(Color.white);
        board.setBounds(520, 470, 170, 220);
        board.setBorder(new LineBorder(Color.black, 1));
        panel.add(board);

        JLabel title = new JLabel("Player A 상태창 입니다.");
        title.setHorizontalAlignment(0);
        title.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        title.setBounds(0, 0, 170, 30);
        board.add(title);

        JPanel listBoard = new JPanel();
        listBoard.setBounds(10, 60, 150, 130);
        listBoard.setBackground(Color.white);
        board.add(listBoard);

        moneyALabel.setBounds(10, 30, 150, 30);
        board.add(moneyALabel);

        boughtACountry.setLineWrap(true);
        listBoard.add(boughtACountry);
    }

    void createPlayerBStatus(Container panel) {
        JPanel board = new JPanel(null);
        board.setBackground(Color.white);
        board.setBounds(110, 110, 170, 220);
        board.setBorder(new LineBorder(Color.black, 1));
        panel.add(board);

        JLabel title = new JLabel("Player B 상태창 입니다.");
        title.setHorizontalAlignment(0);
        title.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        title.setBounds(0, 0, 170, 30);
        board.add(title);

        JPanel listBoard = new JPanel();
        listBoard.setBounds(10, 60, 150, 130);
        listBoard.setBackground(Color.white);
        board.add(listBoard);

        moneyBLabel.setBounds(10, 30, 150, 30);
        board.add(moneyBLabel);

        boughtBCountry.setLineWrap(true);
        listBoard.add(boughtBCountry);
    }

    JLabel createContry(String name, Color color) {
        JLabel label = new JLabel(name);
        label.setOpaque(true);
        label.setBackground(color);
        label.setHorizontalAlignment(JLabel.CENTER);
        return label;
    }

    JPanel createQuadrant(Color color, LayoutManager layout, Dimension size) {
        JPanel panel = new JPanel(layout);
        panel.setPreferredSize(size);
        panel.setBackground(color);
        panel.setBorder(new EmptyBorder(0, 0, 0,0));
        return panel;
    }

    void changePlayerPos(int turn, int dice) {
        if (turn == 0) {
            curposA = (curposA + dice) % 32;
            PosXY go = playerAposition[curposA];
            playerA.setBounds(go.x, go.y, 30, 30);
        }
        else {
            curposB = (curposB + dice) % 32;
            PosXY go = playerBposition[curposB];
            playerB.setBounds(go.x, go.y, 30, 30);
        }
    }

    void gameBoardSetting(Container container) {
        // 동 서 남 북 보드 세팅
        JPanel east = createQuadrant(Color.white, new GridLayout(7, 1), new Dimension(90, 630));
        for (Country i: eastCountry) {
            east.add(createContry(i.name, i.color));
        }
        east.setBounds(720, 90, 90, 630);
        container.add(east);
        container.setComponentZOrder(east, 2);

        JPanel west = createQuadrant(Color.white, new GridLayout(7, 1), new Dimension(90, 630));
        for (Country i: westCountry) {
            west.add(createContry(i.name, i.color));
        }
        west.setBounds(0, 90, 90, 630);
        container.add(west);
        container.setComponentZOrder(west, 3);

        JPanel south = createQuadrant(Color.white, new GridLayout(1, 9), new Dimension(810, 90));
        for (Country i: southCountry) {
            south.add(createContry(i.name, i.color));
        }
        south.setBounds(0, 720, 810, 90);
        container.add(south, BorderLayout.SOUTH);
        container.setComponentZOrder(south, 4);

        JPanel north = createQuadrant(Color.white, new GridLayout(1, 9), new Dimension(810, 90));
        for (Country i: northCountry) {
            north.add(createContry(i.name, i.color));
        }
        north.setBounds(0, 0, 810, 90);
        container.add(north, BorderLayout.NORTH);
        container.setComponentZOrder(north, 5);
    }

    void createPurchasePopup(Container container) {
        purchasePopup.setVisible(false);
        container.add(purchasePopup);
        purchasePopup.setBackground(Color.white);
        purchasePopup.setBounds(300, 300, 210, 210);

        purchasePopup.add(purchaseBtn);
        purchaseBtn.setBounds(60, 150, 100, 40);
        PurchaseListener listener = new PurchaseListener();
        purchaseBtn.addActionListener(listener);

        description.setHorizontalAlignment(0);
        purchasePopup.add(description);
        description.setBounds(0, 90, 210, 40);

        playerLabel.setHorizontalAlignment(0);
        purchasePopup.add(playerLabel);
        playerLabel.setBounds(0, 55, 210, 40);

        purchaseName.setBounds(0, 10, 210, 40);
        purchaseName.setHorizontalAlignment(0);
        purchasePopup.add(purchaseName);
        purchaseName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
    }

    void setMyCountry(int countryId, String player) {
        purchasePopup.setVisible(true);
        Roll.setVisible(false);

        CountryState country = countryState[countryId];
        country.count += 1;
        purchaseName.setText(country.name + country.count + "번 방문함");
        playerLabel.setText(player + "가 " + country.name + "을 방문했습니다.");
        int upPrice = (int) (country.price + (country.count * country.price * 0.1));

        description.setText("<html>도시 가격이 " + country.price + "에서<br/>" + upPrice + "로 증가하였습니다.</html>");
        country.price = upPrice;
        purchaseBtn.setText("확인");
    }
    void setPurchasePopup(int countryId, String player) {
        purchasePopup.setVisible(true);
        Roll.setVisible(false);

        CountryState country = countryState[countryId];
        purchaseName.setText(country.name);
        playerLabel.setText(player + "가 " + country.name + "을 밟았습니다.");
        description.setText(country.price + "원에 구매할 수 있습니다.");
        purchaseBtn.setText("구매하기");
    }

    void setPayPopup(int countryId, String player) {
        purchasePopup.setVisible(true);
        Roll.setVisible(false);
        CountryState country = countryState[countryId];
        country.count += 1;
        purchaseName.setText(country.name + country.count + "번 방문함");
        playerLabel.setText(player + "가 " + country.name + "을 방문했습니다.");
        int upPrice = (int) (country.price + (country.count * country.price * 0.1));
        description.setText(upPrice + "원을 지불해야합니다.");
        country.price = upPrice;
        purchaseBtn.setText("지불하기");
    }

    class RollBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int rand = random.nextInt(6) + 1;

            // A 턴이면
            if (turn == 0) {
                rollLabel.setText("A가 굴린 숫자 : " + rand);
                changePlayerPos(turn, rand);
                turn = 1;

                switch (countryState[curposA].state) {
                    case "notbuy":
                        setPurchasePopup(curposA, "A");
                        break;
                    case "A":
                        // 내땅이니까 가격 증가
                        setMyCountry(curposA, "A");
                        break;
                    case "B":
                        // 넘땅이니까 돈내는 팝업
                        setPayPopup(curposA, "A");
                        break;
                    case "card":
                        // 이벤트 팝업
                    case "game":
                        // 이벤트 팝업
                    case "island":
                    case "olympic":
                    case "airplane":
                    case "tex":
                }
            }
            else {
                rollLabel.setText("B가 굴린 숫자 : " + rand);
                changePlayerPos(turn, rand);
                turn = 0;

                switch (countryState[curposB].state) {
                    case "notbuy":
                        setPurchasePopup(curposB, "B");
                        break;
                    case "B":
                        // 내땅이니까 가격 증가
                        setMyCountry(curposB, "B");
                        break;
                    case "A":
                        // 넘땅이니까 돈내는 팝업
                        setPayPopup(curposB, "B");
                        break;
                    case "card":
                        // 이벤트 팝업
                    case "game":
                        // 이벤트 팝업
                    case "island":
                    case "olympic":
                    case "airplane":
                    case "tex":
                }
            }
        }
    }

    class PurchaseListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton temp = (JButton) e.getSource();
            if (temp.getText() == "구매하기") {
                purchaseAction(turn);
                purchasePopup.setVisible(false);
                Roll.setVisible(true);
            }
            else if (temp.getText() == "지불하기") {
                payAction(turn);
                purchasePopup.setVisible(false);
                Roll.setVisible(true);
            }
            else if (temp.getText() == "확인") {
                purchasePopup.setVisible(false);
                Roll.setVisible(true);
            }
        }
    }

    void appendCountry(int player) {
        if (player == 1) {
            boughtACountry.setText("");
            for (String s: boughtA) {
                boughtACountry.setText(s + ", " + boughtACountry.getText());
            }
        }
        else {
            boughtBCountry.setText("");
            for (String s: boughtB) {
                boughtBCountry.setText(s + ", " + boughtBCountry.getText());
            }
        }
    }

    void payAction(int turn) {
        // 플레이어 포지션에 맞는 액션을 함.
        if (turn == 1) {
            // 땅을 살 수 있는 창을 띄워줌
            moneyA -= countryState[curposA].price * 0.7;
            moneyALabel.setText("현재 자산: " + moneyA);
        }
        if (turn == 0) {
            // 땅을 살 수 있는 창을 띄워줌
            moneyB -= countryState[curposB].price * 0.7;
            moneyBLabel.setText("현재 자산: " + moneyB);
        }
        appendCountry(turn);
    }

    void purchaseAction(int turn) {
        // 플레이어 포지션에 맞는 액션을 함.
        if (turn == 1) {
            // 땅을 살 수 있는 창을 띄워줌
            moneyA -= countryState[curposA].price;
            boughtA.add(countryState[curposA].name);
            countryState[curposA].state = "A";
            moneyALabel.setText("현재 자산: " + moneyA);
        }
        if (turn == 0) {
            // 땅을 살 수 있는 창을 띄워줌
            moneyB -= countryState[curposB].price;
            boughtB.add(countryState[curposB].name);
            countryState[curposB].state = "B";
            moneyBLabel.setText("현재 자산: " + moneyB);
        }
        appendCountry(turn);
    }

    public static void main(String[] args) {
        new BlueMarble();
    }
}
