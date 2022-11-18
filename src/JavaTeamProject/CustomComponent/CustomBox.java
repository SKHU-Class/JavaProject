package JavaTeamProject.CustomComponent;

import javax.swing.*;
import java.awt.*;

public class CustomBox extends JPanel {
    int x;
    int y;
    int width;
    int height;
    String filename;
    Image buffImg;
    Graphics buffG;
    Toolkit imageTool = Toolkit.getDefaultToolkit();

    public CustomBox(int x, int y, int width, int height, String filename) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.filename = filename;
    }
    @Override
    public void paint(Graphics g) {
        buffImg = createImage(getWidth(),getHeight()); // 버퍼링용 이미지 ( 도화지 )
        buffG = buffImg.getGraphics(); // 버퍼링용 이미지에 그래픽 객체를 얻어야 그릴 수 있다고 한다. ( 붓? )
        update(g);
    }

    @Override
    public void update(Graphics g) {
        buffG.clearRect(0, 0, 854, 480); // 백지화
        buffG.drawImage(imageTool.getImage(filename), x, y, this); // 유저 비행기 그리기.
        g.drawImage(buffImg,0,0,this); // 화면g애 버퍼(buffG)에 그려진 이미지(buffImg)옮김. ( 도화지에 이미지를 출력 )
        repaint();
    }
//
//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        g.drawImage(imageTool.getImage(filename), x, y, this);
//        g.setColor(Color.white);
//    }

    public CustomBox setColor(Color color) {
        this.setForeground(color);
        return this;
    }

    public CustomBox setBackgroundColor(Color color) {
        this.setBackground(color);
        return this;
    }

    public CustomBox setOpaqueValue(boolean bool) {
        this.setOpaque(bool);
        return this;
    }
}
