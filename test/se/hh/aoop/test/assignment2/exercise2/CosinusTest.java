package se.hh.aoop.test.assignment2.exercise2;

import se.hh.aoop.src.assignment2.exercise1.Signal;
import se.hh.aoop.src.assignment2.exercise1.observers.SignalWindow;
import se.hh.aoop.src.assignment2.exercise1.observers.StarObserver;
import se.hh.aoop.src.assignment2.exercise2.Cosinus;

public class CosinusTest {

    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.setSampler(new Cosinus(0.0, 0.1));
        signal.addObserver(new SignalWindow());
        signal.addObserver(new StarObserver());
    }

}
