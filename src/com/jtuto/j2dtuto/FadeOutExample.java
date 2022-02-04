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

    public Application() {
    }

    private void loadImage() {
    }

    private void setApplicationSize() {
    }

    private void initTimer() {
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
