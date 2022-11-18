package JavaTeamProject;

import JavaTeamProject.CustomComponent.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuidanceMain extends JFrame {
    // Const
    private int screenWidth = 947;
    private int screenHeight = 740;
    // UI
    CustomImage mainMap = new CustomImage(screenWidth, screenHeight, "images/TeamProject/MainMap.png");
    CustomImage schoolLogo = new CustomImage(screenWidth, screenHeight, "images/TeamProject/MainLogo.png");

    CustomLabel startLabel =
            new CustomLabel(screenWidth / 2 - 140, 550, 280, 80, "둘러보기")
                    .setFont("에스코어 드림", 40)
                    .setColor(Color.white)
                    .setAlignment(JLabel.CENTER);
    CustomLabel startLabelHover =
            new CustomLabel(screenWidth / 2 - 140, 550, 280, 80, "둘러보기")
                    .setFont("에스코어 드림", 40)
                    .setAlignment(JLabel.CENTER)
                    .setColor(new Color(17, 127, 214, 0));

    CustomImage onsu =
            new CustomImage(310, 26, 272, 197, "images/TeamProject/onsu.png")
                    .visible(false);
    CustomImage school =
            new CustomImage(445, 222, 187, 275, "images/TeamProject/school.png")
                    .visible(false);
    CustomImage hangdong =
            new CustomImage(352, 537, 268, 180, "images/TeamProject/hangdong.png")
                    .visible(false);

    public GuidanceMain() {
        setTitle("성공회대 길라잡이");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container mainPage = getContentPane();
        mainPage.setLayout(null);

        setUI(mainPage);
        setAction(mainPage);

        setSize(screenWidth, screenHeight + 20);
        setResizable(false);
        setVisible(true);
    }

    void setUI(Container container) {
        container.add(hangdong);
        container.add(school);
        container.add(onsu);
        container.add(startLabelHover);
        container.add(startLabel);
        container.add(schoolLogo);
        container.add(mainMap);
    }

    void setAction(Container container) {
        startLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                startLabelIn(startLabelHover);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                startLabelOut(startLabelHover);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                startAction(container);
            }
        });

        onsu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(30, onsu, "images/TeamProject/onsu.png");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, onsu, "images/TeamProject/onsu.png");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        school.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(30, school, "images/TeamProject/school.png");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, school, "images/TeamProject/school.png");
            }
        });
        hangdong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(30, hangdong, "images/TeamProject/hangdong.png");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, hangdong, "images/TeamProject/hangdong.png");
            }
        });
    }

    void startLabelIn(JLabel label) {
        Color color = label.getForeground();
        new Thread(() -> {
            for (int a = 0; a < 255; a+=2) {
                startLabelHover.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), a));
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    void startLabelOut(JLabel label) {
        Color color = label.getForeground();
        new Thread(() -> {
            for (int a = 255; a > 0; a-=2) {
                startLabelHover.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), a));
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
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

    void startAction(Container container) {
        remove(startLabelHover);
        remove(startLabel);
        remove(schoolLogo);

        repaint();

        onsu.visible(true);
        school.visible(true);
        hangdong.visible(true);
    }

    public static void main(String[] args) {
        new GuidanceMain();
    }
}
