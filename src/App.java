import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Joy Of Coding");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas canvas = new MyCanvas();
//        canvas.setPreferredSize();
        window.add(canvas);


        window.pack();                         // Fit the window size around the components i.e (just our canvas)
        window.setResizable(false);           // User is unable to resize the window
        window.setLocationRelativeTo(null);  // Open window in the center of the screen
        window.setVisible(true);            // display the window
    }
}

class MyCanvas extends JPanel {
    public MyCanvas() {
        // The method definition expects only one parameter
        setPreferredSize(new Dimension(900, 600));
        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        PaintBrush myBrush = new PaintBrush(g);
        g.setColor(new Color(157, 233, 245));
        g.fillRect(0, 0, 900, 220);

        g.setColor(Color.yellow);
        g.fillOval(680, 30, 60, 60);
    }
}

class PaintBrush {
    private Graphics g;

    public PaintBrush(Graphics graphics) {
        g = graphics;
    }

    public void drawSky() {

    }
}