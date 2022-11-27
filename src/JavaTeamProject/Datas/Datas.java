package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;
import JavaTeamProject.CustomComponent.CustomLabel;
import JavaTeamProject.CustomComponent.CustomPanel;
import JavaTeamProject.Model.Pin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Datas {
    public ArrayList<CustomImage> pinImages = new ArrayList<>(){};

    public CustomPanel detailPanel = new CustomPanel(270, 80, 400, 580, Color.white)
            .visible(false);
    public CustomLabel title = new CustomLabel(10, -20, 380, 90, "기본 타이틀")
            .setFont("에스코어 드림", 18)
            .setAlignment(JLabel.CENTER);
    public CustomImage image = new CustomImage(10, 50, 380, 300, "images/TeamProject/MainMap.png")
            .visible(true);
    public CustomLabel description = new CustomLabel(10, 320, 380, 300,
            "<html>기본 설명입니다. 어쩌구 저쩌구 기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구기본 설명입니다. 어쩌구 저쩌구</html>")
            .setFont("에스코어 드림", 13)
            .setAlignment(JLabel.LEADING);

    public void initDetailPanel(Container container) {
        detailPanel.cancelBtn.setBounds(350, 10, 32, 32);
        container.add(detailPanel);

        detailPanel.add(title);
        detailPanel.add(image);
        detailPanel.add(description);
    }

    public void visiblePins(boolean bool) {
        for(CustomImage pin: pinImages) {
            pin.visible(bool);
        }
    }

    void setMouseListener(CustomImage pinImage, Pin pin) {
        pinImage.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(10, pinImage, "images/TeamProject/pin.png");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(10, pinImage, "images/TeamProject/pin.png");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                title.setText(pin.title);
                description.setText(pin.description);
                image.setIcon(new ImageIcon(pin.imageUrl));
                detailPanel.visible(true);
            }
        });
    }

    void imageEnteredResize(int rate, CustomImage imageComponent, String path) {
        ImageIcon tempImage = new ImageIcon(path);
        Image img = tempImage.getImage();
        Image changeImg = img.getScaledInstance(imageComponent.getWidth() + rate, imageComponent.getHeight() + rate, Image.SCALE_SMOOTH);
        tempImage.setImage(changeImg);
        imageComponent.setBounds(imageComponent.getX() - rate / 2, imageComponent.getY() - rate / 2, imageComponent.getWidth() + rate, imageComponent.getHeight() + rate);
        imageComponent.setIcon(tempImage);
    }
    void imageExitedResize(int rate, CustomImage imageComponent, String path) {
        ImageIcon tempImage = new ImageIcon(path);
        Image img = tempImage.getImage();
        Image changeImg = img.getScaledInstance(imageComponent.getWidth() - rate, imageComponent.getHeight() - rate, Image.SCALE_SMOOTH);
        tempImage.setImage(changeImg);
        imageComponent.setBounds(imageComponent.getX() + rate / 2, imageComponent.getY() + rate / 2, imageComponent.getWidth() - rate, imageComponent.getHeight() - rate);
        imageComponent.setIcon(tempImage);
    }
}
