package exam;

import javax.swing.text.Position;
import java.awt.*;

class PosXY {
    int x;
    int y;

    PosXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Country {
    String name;
    Color color;
    PosXY position;
    Country(String name, Color color) {
        this.name = name;
        this.color = color;
        position = new PosXY(0, 0);
    }
    Country(String name, Color color, PosXY pos) {
        this.name = name;
        this.color = color;
        this.position = pos;
    }
}

class CountryState {
    String state;
    String name;
    int num;
    boolean isOlympic;
    int price;
    int count;
    CountryState(int num, String name, String state, int price) {
        this.state = state;
        this.name = name;
        this.num = num;
        this.price = price;
        this.isOlympic = false;
        this.count = 0;
    }
}
