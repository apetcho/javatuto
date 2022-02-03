package com.jtuto.j2dtuto;

import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ***
class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        BasicStroke bs1 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(bs1);
        g2d.drawRect(15, 15, 80, 50);

        BasicStroke bs2 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_MITER);
        g2d.setStroke(bs2);
        g2d.drawRect(125, 15, 80, 50);

        BasicStroke bs3 = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND);
        g2d.setStroke(bs3);
        g2d.drawRect(235, 15, 80, 50);

        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

// *****
public class JoinsTutorial extends JFrame {
    public JoinsTutorial() {
        initUI();
    }

    private void initUI() {
        add(new Surface());
        setTitle("Joins");
        setSize(340, 110);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JoinsTutorial app = new JoinsTutorial();
                app.setVisible(true);
            }
        });
    }
}
