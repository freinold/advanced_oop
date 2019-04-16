package se.hh.aoop.src.assignment2.exercise9;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public abstract class Presenter extends Applet implements Action {

    private JFrame jFrame;
    private JTextArea jTextArea;
    private JButton northButton, southButton, eastButton, westButton;
    private JComponent centerComponent;

    public Presenter() throws HeadlessException {
        super();
        jFrame = new JFrame();
        jTextArea = new JTextArea();
        northButton = new JButton("North");
        southButton = new JButton("South");
        eastButton = new JButton("East");
        westButton = new JButton("West");
        centerComponent = createCenterComponent();
        jFrame.add(centerComponent);
        jFrame.add(northButton);
        jFrame.add(southButton);
        jFrame.add(eastButton);
        jFrame.add(westButton);
        jFrame.add(jTextArea);
    }

    public abstract JComponent createCenterComponent();
    public abstract void northButtonPressed();
    public abstract void southButtonPressed();
    public abstract void eastButtonPressed();
    public abstract void westButtonPressed();

    public void showText(String text) {
        jTextArea.setText(text);
    }

}
