package se.hh.aoop.assignment1.exercise4;

import java.util.Collection;
import java.util.LinkedList;

public class Stack {

  private LinkedList<Integer> stack;

  public Stack() {
    this.stack = new LinkedList<>();
  }

  public void push(int value) {
    this.stack.add(value);
  }

  public int pop() {
    return this.stack.removeLast();
  }

  public void push(int n, Collection<Integer> elementSet) {
    this.stack.addAll(elementSet);
  }

  public int pop(int n) {
    return 0;
  }



}
