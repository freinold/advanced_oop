package se.hh.aoop.src.assignment2.exercise5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CompositeIcon implements Icon {

    private int width;
    private int height;
    private ArrayList<Icon> icons;
    private ArrayList<Point> locations;

    public CompositeIcon(int width, int height){
        this.width = width;
        this.height = height;
        this.icons = new ArrayList<>();
        this.locations = new ArrayList<>();
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        int j = 0;
        for(Icon i : icons){
            Point pos = locations.get(j);
            i.paintIcon(component, graphics, x + pos.x, y + pos.y);
            j++;
        }
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    public void addIcon(Icon icon, int x, int y){
        icons.add(icon);
        locations.add(new Point(x, y));
    }
}
