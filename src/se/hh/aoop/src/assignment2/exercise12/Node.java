package se.hh.aoop.src.assignment2.exercise12;

import java.util.*;

public class Node<T> implements Tree<T> {

	private List<Tree<T>> children;

	public Node(List<Tree<T>> trees) {
		children = trees;
	}

	//public String toString() {
	//	return getClass().getName() + "[children = " + children + "]";
	//}
	public String toString() {
		return "Node";
	}

	public <R, A> R accept(TreeVisitor<T, R, A> v, A val) {
		return v.visit(this, val);
	}
	
	public List<Tree<T>> getChildren() {
		return children;
	}


}