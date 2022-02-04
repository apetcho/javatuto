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
    }

    @Override
    public void paintComponent(Graphics g) {
    }

    private void step() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {
    }
}

// ---
public class FadeOutExample extends JFrame {
    public FadeOutExample() {
    }

    private void initUI() {
    }

    //
    public static void main(String[] args) {

    }
}
