package com.jtuto.j2dtuto;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ****
class Surface extends JPanel {

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(30, 30, 200, 30);
        g2d.drawLine(200, 300, 300, 300);
        g2d.drawLine(30, 200, 200, 200);
        g2d.drawLine(200, 200, 30, 30);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

// *****
public class LinesTutorial extends JFrame {

    public LinesTutorial() {
    }

    private void initUI() {
    }

    public static void main(String[] args) {
    }
}
