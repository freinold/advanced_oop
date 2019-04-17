package se.hh.aoop.src.assignment2.exercise10;

import se.hh.aoop.src.assignment2.exercise9.Presenter;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class SlideShowPresenter extends Presenter {

    private JLabel jLabel;
    private ArrayList<String> pathList;
    private ArrayList<String> descriptionList;
    private int count;

    public SlideShowPresenter(String picturePathFile, String descriptionFile) {
        super();
        pathList = new ArrayList<>();
        descriptionList = new ArrayList<>();
        try (Stream<String> pstream = Files.lines(Paths.get(picturePathFile));
                Stream<String> dstream = Files.lines(Paths.get(descriptionFile))) {
            pstream.forEach(pathList::add);
            dstream.forEach(descriptionList::add);
        } catch (IOException ioException) {
            System.out.println("ioException = " + ioException);
        }
        count = 0;
        reloadDisplay();
    }

    @Override
    public JComponent createCenterComponent() {
        jLabel = new JLabel();
        jLabel.setPreferredSize(new Dimension(400, 200));
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
        count = (count + 1) % pathList.size();
        reloadDisplay();
    }

    @Override
    public void westButtonPressed() {
        count = (count - 1) % pathList.size();
        if(count < 0) count = pathList.size() - 1;
        reloadDisplay();
    }

    private void reloadDisplay() {
        jLabel.setIcon(new ImageIcon(pathList.get(count)));
        showText(descriptionList.get(count));
    }

}
