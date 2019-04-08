package se.hh.aoop.test.assignment1.exercise5;

import org.junit.jupiter.api.Test;
import se.hh.aoop.src.assignment1.exercise5.Message;

import se.hh.aoop.src.assignment1.exercise5.MessageQueueImproved;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {

    @Test
    void sizeRemoveAddTest() {
        MessageQueueImproved queue = new MessageQueueImproved();
        assertEquals(queue.size(),0);
        for(int i = 0; i < 64; i++) {
            queue.add(new Message("TestMessageNR"+ i));
        }
        assertEquals(queue.size(),64);
        for(int i = 0; i < 64; i++) {
            assertEquals(queue.remove().getText(),"TestMessageNR"+ i);

        }
        assertEquals(queue.size(),0);
    }
    @Test
    void prevonditionsTest(){
        MessageQueueImproved queue = new MessageQueueImproved();
        try {
            queue.remove();
        }
        catch (Throwable t)
        {
            assertNotNull(t);
        }
        try {
            queue.peek();
        }
        catch (Throwable t)
        {
            assertNotNull(t);
        }


    }
    @Test
    void basicSizeTest(){
        MessageQueueImproved queue = new MessageQueueImproved();
        for(int i = 0; i < 16; i++) {
            queue.add(new Message("TestMessageNR"+ i));
        }
        assertEquals(queue.remove().getText(),"TestMessageNR0");
        queue.add(new Message("TestMessageEND"));
        for(int i = 1; i < 16; i++) {
            assertEquals(queue.remove().getText(),"TestMessageNR"+ i);
        }
        assertEquals(queue.remove().getText(),"TestMessageEND");
    }



}

