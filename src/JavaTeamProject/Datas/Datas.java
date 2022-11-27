package JavaTeamProject.Datas;

import JavaTeamProject.CustomComponent.CustomImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Datas {
    public ArrayList<CustomImage> pinImages = new ArrayList<>(){};

    public void visiblePins(boolean bool) {
        for(CustomImage pin: pinImages) {
            pin.visible(bool);
        }
    }

    void setMouseListener(CustomImage pin) {
        pin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(10, pin, "images/TeamProject/pin.png");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(10, pin, "images/TeamProject/pin.png");
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
