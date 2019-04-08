package se.hh.aoop.src.assignment1.exercise13;

import javax.swing.Icon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle implements Icon {

    private Color color;
    private int size;

    public Circle(Color color,int size){
        this.color = color;
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x,y,size,size);
        g2.setColor(color);
        g2.fill(circle);
    }

    @Override
    public int getIconWidth() {
        return size;
    }

    @Override
    public int getIconHeight() {
        return size;
    }

    public void setColor(Color color){
        this.color = color;
    }

}
