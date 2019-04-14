package se.hh.aoop.src.assignment2.exercise5;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SquareIcon implements Icon {

    int width;

    public SquareIcon(int width){
        this.width = width;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        Graphics2D g = (Graphics2D) graphics;
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, width, width);
        g.fill(square);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return width;
    }
}
