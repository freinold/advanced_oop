package se.hh.aoop.src.assignment2.exercise10;

import se.hh.aoop.src.assignment2.exercise9.Presenter;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SlideShowPresenter extends Presenter {

    private JLabel jLabel;

    @Override
    public JComponent createCenterComponent() {
        jLabel = new JLabel();
        return jLabel;
    }

    @Override
    public void northButtonPressed() {
        
    }

    @Override
    public void southButtonPressed() {

    }

    @Override
    public void eastButtonPressed() {

    }

    @Override
    public void westButtonPressed() {

    }

}
