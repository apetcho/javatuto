package com.jtuto.j2dtuto;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// ---
class Application extends JPanel implements ActionListener {

    private int count;
    private Timer timer;
    private final int INITIAL_DELAY = 200;
    private final int DELAY = 80;
    private final int NUMER_OF_LINES = 8;
    private final int STROKE_WIDTH = 3;

    private final double[][] trs = {
            { 0.0, 0.15, 0.30, 0.50, 0.65, 0.80, 0.90, 1.0 },
            { 1.0, 0.0, 0.15, 0.30, 0.50, 0.65, 0.80, 0.90 },
            { 0.90, 1.0, 0.0, 0.15, 0.3, 0.5, 0.65, 0.80 },
            { 0.80, 0.90, 1.0, 0.0, 0.15, 0.30, 0.50, 0.065 },
            { 0.65, 0.80, 0.90, 1.0, 0.0, 0.15, 0.30, 0.5 },
            { 0.50, 0.65, 0.80, 0.90, 1.0, 0.0, 0.15, 0.3 },
            { 0.30, 0.50, 0.65, 0.80, 0.90, 1.0, 0.0, 0.15 },
            { 0.15, 0.30, 0.50, 0.65, 0.80, 0.90, 1.0, 0.0 }
    };

    // ---
    public Application() {
        initTimer();
    }

    // ---
    private void initTimer() {
        timer = new Timer(DELAY, this);
        timer.setInitialDelay(INITIAL_DELAY);
        timer.start();
    }

    // ---
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        //
        int width = getWidth();
        int height = getHeight();

        g2d.setStroke(new BasicStroke(
                STROKE_WIDTH,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.translate(width / 2, height / 2);

        for (int i = 0; i < NUMER_OF_LINES; i++) {
            float alpha = (float) trs[count % NUMER_OF_LINES][i];
            AlphaComposite acomp = AlphaComposite.getInstance(
                    AlphaComposite.SRC_OVER, alpha);
            g2d.setComposite(acomp);

            g2d.rotate(Math.PI / 4.f);
            g2d.drawLine(0, -10, 0, -40);
        }

        g2d.dispose();
    }

    // ---
    @Override
    public void paintComponent(Graphics g) {
    }

    // ---
    @Override
    public void actionPerformed(ActionEvent event) {
        repaint();
        count++;
    }
}

// ---
public class WaitingExample extends JFrame {

    public WaitingExample() {
    }

    // ---
    private void initUI() {
    }

    // ---
    public static void main(String[] args) {

    }
}
