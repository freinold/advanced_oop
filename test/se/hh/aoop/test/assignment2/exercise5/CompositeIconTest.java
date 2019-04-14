package se.hh.aoop.test.assignment2.exercise5;

import static org.junit.jupiter.api.Assertions.*;
import se.hh.aoop.src.assignment2.exercise5.*;

import javax.swing.*;

public class CompositeIconTest {

    public static void main(String[] args) {
        CompositeIcon composite = new CompositeIcon(100, 100);
        SquareIcon square = new SquareIcon(20);
        RoundIcon circle = new RoundIcon(10);
        composite.addIcon(square, 10, 10);
        composite.addIcon(circle, 10, 40);
        JFrame frame = new JFrame("This is a composite icon list");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(composite);
        frame.getContentPane().add(label);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}