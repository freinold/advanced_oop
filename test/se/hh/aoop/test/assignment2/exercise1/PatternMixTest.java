package se.hh.aoop.test.assignment2.exercise1;

import org.junit.jupiter.api.Test;
import se.hh.aoop.src.assignment2.exercise1.Signal;
import se.hh.aoop.src.assignment2.exercise1.observers.SignalWindow;
import se.hh.aoop.src.assignment2.exercise1.observers.StarObserver;
import se.hh.aoop.src.assignment2.exercise1.samplers.Sinus;

public class PatternMixTest {

    @Test
    public void patternMixTest() {
        Signal signal = new Signal();
        signal.setSampler(new Sinus(0.0, 0.5));
        signal.addObserver(new SignalWindow());
        signal.addObserver(new StarObserver());
    }

}
