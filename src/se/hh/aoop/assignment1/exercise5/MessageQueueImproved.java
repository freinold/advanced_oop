package se.hh.aoop.assignment1.exercise5;

public class MessageQueueImproved {
    final int INITIAL_CAPACITY = 16;

    private Message[] elements;
    private int head;
    private int tail;
    private int count;

    /**
     * Constructs a empty message queue
     */
    public MessageQueueImproved()
    {
        elements = new Message[INITIAL_CAPACITY];
        count = 0;
        head = 0;
        tail = 0;
    }

    /**
     * removes message at head
     * @return the removed message
     * @precondition size() > 0
     */
    public Message remove(){
        assert count > 0: "violated precondition size() > 0";
        Message toRemove = elements[head];
        head = (head +1) % elements.length;
        count --;
        return  toRemove;
    }

    /**
     * Append a message at tail
     * @param message the message to be added
     *
     */
    public void add(Message message){
        if(elements.length  == count){ //array is full
            //copy data to new bigger array
            tail = elements.length;
            Message[] newArray = new Message[elements.length + INITIAL_CAPACITY];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;

        }
        elements[tail] = message;
        tail = (tail+1) % elements.length;
        count ++;
    }

    /**
     * Get the number of messages in the queue
     * @return number of messages
     */
    public int size(){
        return count;
    }

    /**
     * Get the message at head
     * @return the message at the head of the que
     * @precondition size() > 0
     */
    public Message peek() {
        assert count > 0: "violated precondition size() > 0";
        return elements[head];
    }
}
