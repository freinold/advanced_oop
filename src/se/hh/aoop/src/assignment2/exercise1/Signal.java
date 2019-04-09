package se.hh.aoop.src.assignment2.exercise1;

import se.hh.aoop.src.assignment2.exercise1.samplers.DefaultSampler;
import se.hh.aoop.src.assignment2.exercise1.samplers.Sampler;

import javax.swing.Timer;
import java.util.Observable;

public class Signal extends Observable {

    private Sampler sampler;
    private final int SAMPLING = 100;

    public Signal() {
        sampler = new DefaultSampler();
        Timer t = new Timer(SAMPLING, e -> {
            setChanged();
            notifyObservers(sampler.read());
        });
        t.start();
    }

    public void setSampler(Sampler sampler) {
        this.sampler = sampler;
    }

}