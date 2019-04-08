package se.hh.aoop.src.assignment2.exercise1.observers;

import java.util.Observable;
import java.util.Observer;

public class StarObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		int val = (int) arg;
		for (int i = 0; i < val; i++)
			System.out.print("*");
		System.out.println();
	}
}