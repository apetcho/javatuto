package com.jtuto.j2dtuto;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

// *****
class TextureApp extends JPanel {
    private BufferedImage slate;
    private BufferedImage java;
    private BufferedImage pane;
    private TexturePaint slatetp;
    private TexturePaint javatp;
    private TexturePaint panetp;

    // ---
    public TextureApp() {
        loadImages();
    }

    // ---
    private void loadImages() {
        try {
            slate = ImageIO.read(new File("../images/slate.png"));
            java = ImageIO.read(new File("../images/java.png"));
            pane = ImageIO.read(new File("../images/pane.png"));

        } catch (IOException ex) {
            Logger.getLogger(TextureApp.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    // ---
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        slatetp = new TexturePaint(slate, new Rectangle(0, 0, 90, 60));
        javatp = new TexturePaint(java, new Rectangle(0, 0, 90, 60));
        panetp = new TexturePaint(pane, new Rectangle(0, 0, 90, 60));

        g2d.setPaint(slatetp);
        g2d.fillRect(10, 15, 90, 60);

        g2d.setPaint(javatp);
        g2d.fillRect(130, 15, 90, 60);

        g2d.setPaint(panetp);
        g2d.fillRect(250, 15, 90, 60);

        g2d.dispose();
    }

    // ---
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

// *****
public class TextureTutorial extends JFrame {
    public TextureTutorial() {
        initUI();
    }

    // ---
    private void initUI() {
    }

    // ---
    public static void main(String[] args) {

    }
}
