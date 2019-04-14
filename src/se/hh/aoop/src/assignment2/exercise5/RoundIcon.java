package se.hh.aoop.src.assignment2.exercise5;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class RoundIcon implements Icon {

    int radius;

    public RoundIcon(int radius){
        this.radius = radius;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        Graphics2D g = (Graphics2D) graphics;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y ,radius * 2, radius *2);
        g.fill(circle);
    }

    @Override
    public int getIconWidth() {
        return radius*2;
    }

    @Override
    public int getIconHeight() {
        return radius*2;
    }
}
