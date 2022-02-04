package com.jtuto.j2dtuto;

import java.awt.AlphaComposite;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// ---
class Application extends JPanel implements ActionListener {
    // ****
    private Image sun;
    private Image cloud;
    private Timer timer;
    private float alpha = 1.0f;

    private final int DELAY = 600;

    // ****
    public Application() {
        loadImages();
        initTimer();
    }

    // ****
    private void loadImages() {
        final String IMPATH = "/Users/oriprox/Documents/cs/"
                + "java/practice/javatuto/images/";
        sun = new ImageIcon(IMPATH + "sun.png").getImage();
        cloud = new ImageIcon(IMPATH + "cloud.png").getImage();
    }

    // ****
    private void initTimer() {
        timer = new Timer(DELAY, this);
        timer.start();
    }

    // ****
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        BufferedImage bufimg = new BufferedImage(
                220, 140, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gbi = bufimg.createGraphics();

        AlphaComposite ac = AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, alpha);

        gbi.drawImage(sun, 40, 30, null);
        gbi.setComposite(ac);
        gbi.drawImage(cloud, 20, 20, null);

        g2d.drawImage(bufimg, 20, 20, null);

        gbi.dispose();
        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
    }

    // ****
    private void step() {
    }

    // ****
    @Override
    public void actionPerformed(ActionEvent event) {
    }
}

// ---
public class SunAndCloudExample extends JFrame {

    // *****
    public SunAndCloudExample() {
    }

    // *****
    private void initUI() {
    }

    // *****
    public static void main(String[] args) {

    }
}
