package com.jtuto.j2dtuto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

// ****
class Surface extends JPanel implements ActionListener {
    private final int DELAY = 150;

    /**
     * Timer object used to create animations. It fires ActionEvents at the
     * specified interval.
     */
    private Timer timer;

    public Surface() {
        initTimer();
    }

    /**
     * Initiatialize the timer used to draw points in a cycle.
     */
    private void initTimer() {
        timer = new Timer(DELAY, this);
        timer.start();
    }

    // ---
    public Timer getTimer() {
        return timer;
    }

    // ---
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // Paint the points in blue color
        g2d.setPaint(Color.blue);

        // Get the width and height of this panel
        int width = getWidth();
        int height = getHeight();

        // Random number generator engine
        Random r = new Random();
        for (int i = 0; i < 2000; i++) {
            int x = Math.abs(r.nextInt()) % width;
            int y = Math.abs(r.nextInt()) % height;
            g2d.drawLine(x, y, x, y);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    /**
     * For each action event, we call repaint() method to cause the whole client
     * to be redrawn.
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        repaint();
    }
}

// ******
public class PointTutorial extends JFrame {
    PointTutorial() {
        initUI();
    }

    private void initUI() {
        final Surface surface = new Surface();
        add(surface);

        /**
         * Retrieve the timer when the window is about to close. If not done
         * explicitly, it may hold resources indefinitely.
         */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                Timer timer = surface.getTimer();
                timer.stop();
            }
        });

        setTitle("Points");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // ---
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PointTutorial app = new PointTutorial();
                app.setVisible(true);
            }
        });
    }
}
