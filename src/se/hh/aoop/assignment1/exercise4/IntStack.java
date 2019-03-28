package se.hh.aoop.assignment1.exercise4;

import java.util.Arrays;
import java.util.Stack;

public class IntStack {

    private Stack<Integer> stack;

    public IntStack() {
        this.stack = new Stack<>();
    }

    public void push(int value) {
        this.stack.push(value);
    }

    public int pop() {
        return this.stack.pop();
    }

    public void push(int n, int[] values) {
        Arrays.stream(values).forEach(x -> this.stack.push(x));
    }

    public int[] pop(int n) {
        int[] values = new int[n];
        for (int i = n - 1; i >=  0; i--) {
            values[i] = this.stack.pop();
        }
        return values;
    }

}
