package se.hh.aoop.test.assignment2.exercise1;

import se.hh.aoop.src.assignment2.exercise1.Signal;
import se.hh.aoop.src.assignment2.exercise1.observers.SignalWindow;
import se.hh.aoop.src.assignment2.exercise1.observers.StarObserver;
import se.hh.aoop.src.assignment2.exercise1.samplers.Sinus;

public class PatternMixTest {

    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.setSampler(new Sinus(0.0, 0.1));
        signal.addObserver(new SignalWindow());
        signal.addObserver(new StarObserver());
        //signal.addObserver((o, value) -> System.out.println(String.format("%" + value + "s", "*")));
    }

}
