package exam;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BlueMarble extends JFrame {
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
            new Country("무인도", Color.PINK)
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

    public BlueMarble() {
        setTitle("BlueMarble");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // 맨 아래 레이어
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(null);

        createPlayer(jpanel1);
        gameBoardSetting(jpanel1);


        c.add(jpanel1);
        setSize(810, 835);
        setVisible(true);
    }

    void createRollBtn(Container panel) {
        JButton Roll = new JButton("Roll");

    }

    void createPlayer(Container panel) {
        JButton playerA = new JButton("A");
        playerA.setBounds(730, 730, 30, 30);
        panel.add(playerA);
        panel.setComponentZOrder(playerA, 0);

        JButton playerB = new JButton("B");
        playerB.setBounds(770, 730, 30, 30);
        panel.add(playerB);
        panel.setComponentZOrder(playerB, 1);
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
        south.setBounds(0, 0, 810, 90);
        container.add(south, BorderLayout.SOUTH);
        container.setComponentZOrder(south, 4);

        JPanel north = createQuadrant(Color.white, new GridLayout(1, 9), new Dimension(810, 90));
        for (Country i: northCountry) {
            north.add(createContry(i.name, i.color));
        }
        north.setBounds(0, 720, 810, 90);
        container.add(north, BorderLayout.NORTH);
        container.setComponentZOrder(north, 5);
    }

    public static void main(String[] args) {
        new BlueMarble();
    }
}
