package se.hh.aoop.src.assignment2.exercise9;

import javax.swing.*;
import java.awt.*;

public abstract class Presenter {

    private JFrame jFrame;
    private JTextArea jTextArea;
    private JButton northButton, southButton, eastButton, westButton;
    private JComponent centerComponent;

    public Presenter() {
        jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setPreferredSize(new Dimension(400, 300));
        jTextArea = new JTextArea();
        northButton = new JButton("North");
        southButton = new JButton("South");
        eastButton = new JButton("East");
        westButton = new JButton("West");
        centerComponent = createCenterComponent();
        jFrame.setLayout(new FlowLayout());
        jFrame.getContentPane().add(centerComponent);
        jFrame.getContentPane().add(northButton);
        jFrame.getContentPane().add(southButton);
        jFrame.getContentPane().add(westButton);
        jFrame.getContentPane().add(eastButton);
        jFrame.add(jTextArea);
        northButton.addActionListener(e -> northButtonPressed());
        southButton.addActionListener(e -> southButtonPressed());
        eastButton.addActionListener(e -> eastButtonPressed());
        westButton.addActionListener(e -> westButtonPressed());
        jFrame.pack();
        jFrame.setVisible(true);
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
