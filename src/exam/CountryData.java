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
    int num;
    CountryState(int num, String state) {
        this.state = state;
        this.num = num;
    }
}
