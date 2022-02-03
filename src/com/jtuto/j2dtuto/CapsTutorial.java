package com.jtuto.j2dtuto;

import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.spi.ResourceBundleProvider;

import javax.swing.JFrame;
import javax.swing.JPanel;

// *****
class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        int y = 30;

        BasicStroke bs1 = new BasicStroke(8, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs1);
        g2d.drawLine(20, y, 250, y);

        BasicStroke bs2 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs2);
        y = 80;
        g2d.drawLine(20, y, 250, y);

        y = 130;
        BasicStroke bs3 = new BasicStroke(8, BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs3);
        y = 80;
        g2d.drawLine(20, y, 250, y);

        BasicStroke bs4 = new BasicStroke();
        g2d.setStroke(bs4);

        g2d.drawLine(20, 20, 20, 140);
        g2d.drawLine(250, 20, 250, 140);
        g2d.drawLine(254, 20, 254, 140);

        g2d.dispose();
    }

    // ---
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
