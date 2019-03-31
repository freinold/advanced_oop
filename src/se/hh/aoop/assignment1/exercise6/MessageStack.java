package se.hh.aoop.assignment1.exercise6;

import java.util.Stack;
import se.hh.aoop.assignment1.exercise5.Message;

public class MessageStack {

    private Stack<Message> stack;
    private int size;

    public MessageStack(){
        this.stack = new Stack<>();
        this.size = 0;
    }

    public void push(Message m){
        this.size++;
        this.stack.push(m);
    }

    public Message pop(){
        this.size --;
        Message m = this.stack.pop();
        return m;
    }

    public void push (int n, Message[] m){
        for(int i = 0; i < n; i++){
            this.stack.push(m[i]);
        }
        this.size = this.size + n;
    }

    public Message[] pop(int n){
       Message[] m = new Message[n];

        for(int i = n - 1; i >= 0; i--) {
            m[i] = this.stack.pop();
        }

        this.size = this.size - n;

        return m;
    }

    public int size(){
        return this.size;
    }
}
