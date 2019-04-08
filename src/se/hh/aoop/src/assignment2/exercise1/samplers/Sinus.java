package se.hh.aoop.src.assignment2.exercise1.samplers;

public class Sinus implements Sampler {

	private double arg;
	private double delta;

	public Sinus(double start, double delta) {
		arg = start;
		this.delta = delta;
	}

	public double read() {
		double x = arg;
		arg = arg + delta;
		return 60 + Math.sin(x) * 30;
	}
}