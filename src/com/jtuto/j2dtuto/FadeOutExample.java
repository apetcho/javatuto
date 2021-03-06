package com.jtuto.j2dtuto;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// --
class Application extends JPanel implements ActionListener {

    private Image img;
    private Timer timer;
    private float alpha = 1.0f;

    private final int DELAY = 40;
    private final int INITIAL_DELAY = 500;

    private final String IMPATH = "/Users/oriprox/Documents/cs/" +
            "java/practice/javatuto/";

    public Application() {
        loadImage();
        setApplicationSize();
        initTimer();
    }

    private void loadImage() {
        img = new ImageIcon(IMPATH + "mushrooms.jpg").getImage();
    }

    private void setApplicationSize() {
        int h = img.getHeight(this);
        int w = img.getWidth(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void initTimer() {
        timer = new Timer(DELAY, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        AlphaComposite acom = AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(acom);
        g2d.drawImage(img, 0, 0, null);

        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void step() {
        alpha = -0.01f;
        if (alpha <= 0.0) {
            alpha = 0.0f;
            timer.stop();
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        step();
        repaint();
    }
}

// ---
public class FadeOutExample extends JFrame {
    public FadeOutExample() {
        initUI();
    }

    private void initUI() {
        add(new Application());
        pack();
        setTitle("Fade Out");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FadeOutExample app = new FadeOutExample();
                app.setVisible(true);
            }
        });
    }
}
