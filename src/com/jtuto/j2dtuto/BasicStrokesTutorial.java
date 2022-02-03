package com.jtuto.j2dtuto;

import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Show various types of dashes.
 * 
 * @note A dash attribute is a pattern, which is created by mixing opaque and
 *       transparent sections.
 */
class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        // We are going to change the stroke attribute of the graphics object,
        // therefore we work with a copy of the Graphics object.

        Graphics2D g2d = (Graphics2D) g.create();

        float[] dash1 = { 2f, 0f, 2f };
        float[] dash2 = { 1f, 1f, 1f };
        float[] dash3 = { 4f, 0f, 2f };
        float[] dash4 = { 4f, 4f, 1f };

        g2d.drawLine(20, 40, 250, 40);

        BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash1, 2.f);

        BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash2, 2.f);

        BasicStroke bs3 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash3, 2.f);

        BasicStroke bs4 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 1.0f, dash4, 2.f);

        g2d.setStroke(bs1);
        g2d.drawLine(20, 80, 250, 80);

        g2d.setStroke(bs2);
        g2d.drawLine(20, 120, 250, 120);

        g2d.setStroke(bs3);
        g2d.drawLine(20, 160, 250, 160);

        g2d.setStroke(bs4);
        g2d.drawLine(20, 200, 250, 200);

        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

// ******
public class BasicStrokesTutorial extends JFrame {
    public BasicStrokesTutorial() {
    }

    private void initUI() {
    }

    //
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BasicStrokesTutorial app = new BasicStrokesTutorial();
                app.setVisible(true);
            }
        });
    }
}
