package Lib;
import java.awt ;
import javax.swing;
import javax.management.timer.Timer;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.*;

public class RollingBall extends JPanel {
public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawOval(100,90,80,80);
    g.fillArc(100,90,80,80,   0,180);
}
}