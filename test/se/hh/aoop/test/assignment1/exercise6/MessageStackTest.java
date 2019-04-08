package se.hh.aoop.test.assignment1.exercise6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import se.hh.aoop.src.assignment1.exercise5.Message;
import se.hh.aoop.src.assignment1.exercise6.MessageStack;

class MessageStackTest {

    @Test
    void simplePushPullTest() {
        MessageStack stack = new MessageStack();
        assertEquals(stack.size(),0);
        stack.push(new Message("Text1"));
        assertEquals(stack.size(), 1);
        assertEquals(stack.pop().getText(), "Text1");
        assertEquals(stack.size(), 0);
    }

    @Test
    void multiplePushPullTest(){
        MessageStack stack = new MessageStack();
        assertEquals(stack.size(),0);
        Message[] m = new Message[64];
        for(int i = 0; i < 64; i++){
            m[i] = new Message("Message " + i);
        }
        stack.push(64, m);
        assertEquals(stack.size(),64);
        Message[] t;
        t = stack.pop(64);
        for(int i = 0; i < 64; i++){
            assertEquals(m[i].getText(), t[i].getText());
        }
        assertEquals(stack.size(),0);
    }

    @Test
    void basicStackTest(){
        MessageStack stack = new MessageStack();
        assertEquals(stack.size(), 0);
        for(int i = 0; i < 64; i++){
            stack.push(new Message("Message " + i));
        }
        assertEquals(stack.size(), 64);
        assertEquals(stack.pop().getText(), "Message 63");
        assertEquals(stack.size(), 63);
    }
}