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

    // ---
    public Application() {
    }

    // ---
    private void initTimer() {
    }

    // ---
    private void doDrawing(Graphics g) {
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
