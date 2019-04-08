package se.hh.aoop.src.assignment1.exercise13;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;

public class Main {

    public static void main(String... args){
        JFrame frame = new JFrame();
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");
        Circle circle = new Circle(Color.red,50);
        JLabel label = new JLabel(circle);

        blueButton.addActionListener(e -> {
            circle.setColor(Color.blue);
            label.repaint();
        });

        redButton.addActionListener(e -> {
            circle.setColor(Color.red);
            label.repaint();
        });

        greenButton.addActionListener(e -> {
            circle.setColor(Color.green);
            label.repaint();
        });

        frame.setLayout(new FlowLayout());
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
