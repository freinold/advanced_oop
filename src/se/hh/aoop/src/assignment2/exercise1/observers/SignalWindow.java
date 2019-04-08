package se.hh.aoop.src.assignment2.exercise1.observers;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.Observable;
import java.util.Observer;

public class SignalWindow extends JFrame implements Observer {

	private JTextArea jta;

	public SignalWindow() {
		jta = new JTextArea(100, 20);
		jta.append("The signal amplitude.\n");
		add(jta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public void updateSignal(double x) {

	}

	@Override
	public void update(Observable o, Object arg) {
		double val = (double) arg;
		jta.append("" + String.format("%.6f", val) + "\n");
	}
}