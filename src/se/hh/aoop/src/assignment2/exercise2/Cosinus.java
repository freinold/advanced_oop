package se.hh.aoop.src.assignment2.exercise2;

import se.hh.aoop.src.assignment2.exercise1.samplers.Sampler;

public class Cosinus implements Sampler {

    private double arg;
    private double delta;

    public Cosinus(double start, double delta) {
        this.arg = start;
        this.delta = delta;
    }

    @Override
    public double read() {
        double x = arg;
        arg += delta;
        return 60 + Math.cos(x) * 30;
    }

}
