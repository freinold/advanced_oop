package se.hh.aoop.test.assignment1.exercise8;

import org.junit.jupiter.api.Test;
import se.hh.aoop.assignment1.exercise5.Message;
import se.hh.aoop.assignment1.exercise8.MessageQueue;

public class MessageQueueTest {

    @Test
    public void multTest() {
        MessageQueue messageQueue = new MessageQueue();
        Message message1 = new Message("m1");
        Message message2 = new Message("m2");
        Message message3 = new Message("m3");
        messageQueue.multAdd(message1, message2, message3);
        Message[] returnMessages = messageQueue.multRemove(3);

    }
}
