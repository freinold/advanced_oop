package se.hh.aoop.src.assignment1.exercise13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String args[]){
        JFrame frame = new JFrame();
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");
        Circle circle = new Circle(Color.red,50);
        JLabel lable = new JLabel(circle);

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circle.setColor(Color.blue);
                lable.repaint();

            }
        });
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circle.setColor(Color.red);
                lable.repaint();

            }
        });
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circle.setColor(Color.green);
                lable.repaint();

            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);
        frame.add(lable);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }
}
