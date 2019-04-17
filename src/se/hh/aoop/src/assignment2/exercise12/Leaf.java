package se.hh.aoop.src.assignment2.exercise12;

public class Leaf<T> implements Tree<T> {

	private T value;

	public Leaf(T v) {
		value = v;
	}

	public String toString() {
		return  "Leaf: [value = " + value + " ]";
	}

	public <R,A> R accept(TreeVisitor<T, R, A> v,A val) {
		return v.visit(this, val);
	}
	
	public T getValue() {
		return value;
	}
}