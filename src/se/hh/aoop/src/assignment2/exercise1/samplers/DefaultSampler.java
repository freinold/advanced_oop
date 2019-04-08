package se.hh.aoop.src.assignment2.exercise1.samplers;

public class DefaultSampler implements Sampler {

	public double read() {
		return Math.random() * 100;
	}

}