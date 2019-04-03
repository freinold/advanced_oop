package se.hh.aoop.src.assignment1.exercise6;

import java.util.Stack;
import se.hh.aoop.src.assignment1.exercise5.Message;


/**
 * @invariant size >= 0
 */

public class MessageStack {

    private Stack<Message> stack;
    private int size;

    public MessageStack(){
        this.stack = new Stack<>();
        this.size = 0;
    }


    /**
     * @param m
     * @precondition true
     * @postcondition size > 0
     */
    public void push(Message m){
        this.size++;
        this.stack.push(m);
    }

    /**
     * @return Return the top of the stack
     * @precondition size > 0
     * @postcondition size >= 0
     */
    public Message pop(){
        this.size --;
        Message m = this.stack.pop();
        return m;
    }

    /**
     * @param n
     * @param m
     * @precondition true
     * @postcondition size > 0
     */
    public void push (int n, Message[] m){
        for(int i = 0; i < n; i++){
            this.stack.push(m[i]);
        }
        this.size = this.size + n;
    }

    /**
     * @param n
     * @return Return the top of the stack
     * @precondition size >= n
     * @postcondition size >= 0
     */
    public Message[] pop(int n){
       Message[] m = new Message[n];

        for(int i = n - 1; i >= 0; i--) {
            m[i] = this.stack.pop();
        }

        this.size = this.size - n;

        return m;
    }

    /**
     * @return Current size of the stack
     * @precondition true
     */
    public int size(){
        return this.size;
    }
}
