package se.hh.aoop.src.assignment2.exercise12;

public interface TreeVisitor<T, R, A> {

	R visit(Tree<T> t, A val);
	R visit(Leaf<T> l, A val);
	R visit(Node<T> n, A val);
}