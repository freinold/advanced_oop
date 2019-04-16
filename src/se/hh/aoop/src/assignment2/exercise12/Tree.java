package se.hh.aoop.src.assignment2.exercise12;

public interface Tree<T> {

	<R, A> R accept(TreeVisitor<T, R, A> v, A val);

}