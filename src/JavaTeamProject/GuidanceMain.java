package JavaTeamProject;

import JavaTeamProject.CustomComponent.*;
import JavaTeamProject.DetailView.ButtonStatus;
import JavaTeamProject.DetailView.OnsuDetailView;

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

    CustomImage onsuArrow =
            new CustomImage(160, 136, 246, 85, "images/TeamProject/onsuArrow.png")
                    .visible(false);
    CustomImage schoolArrow =
            new CustomImage(285, 302, 244, 102, "images/TeamProject/schoolArrow.png")
                    .visible(false);
    CustomImage hangdongArrow =
            new CustomImage(482, 617, 245, 63, "images/TeamProject/hangdongArrow.png")
                    .visible(false);

    OnsuDetailView onsuPanel = new OnsuDetailView();
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
        container.add(onsuPanel);
        container.add(onsuArrow);
        container.add(schoolArrow);
        container.add(hangdongArrow);
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
                visibleImage(onsuArrow, true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, onsu, "images/TeamProject/onsu.png");
                visibleImage(onsuArrow, false);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("onsu Click");
                openDetailPanel(onsuPanel);
            }
        });
        school.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(30, school, "images/TeamProject/school.png");
                visibleImage(schoolArrow, true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, school, "images/TeamProject/school.png");
                visibleImage(schoolArrow, false);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("school Click");
            }
        });
        hangdong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                imageEnteredResize(30, hangdong, "images/TeamProject/hangdong.png");
                visibleImage(hangdongArrow, true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                imageExitedResize(30, hangdong, "images/TeamProject/hangdong.png");
                visibleImage(hangdongArrow, false);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("hangdong Click");
            }
        });
    }

    void openDetailPanel(CustomPanel customPanel) {
        customPanel.visible(true);
        setButtonStatus(false);

        onsuPanel.setAction(bool -> {
            setButtonStatus(bool);
        });
    }

    void setButtonStatus(Boolean bool) {
        onsu.setVisible(bool);
        school.setVisible(bool);
        hangdong.setVisible(bool);
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

    void visibleImage(CustomImage image, Boolean bool) {
        image.setVisible(bool);
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
