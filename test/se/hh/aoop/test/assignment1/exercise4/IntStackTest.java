package se.hh.aoop.test.assignment1.exercise4;

import org.junit.jupiter.api.*;
import se.hh.aoop.assignment1.exercise4.IntStack;

public class IntStackTest {

  @Test
  void basicTest() {
    IntStack s = new IntStack();
    int val1 = -1;
    int val2 = 0;
    int val3 = 1;
    s.push(val1);
    s.push(val2);
    s.push(val3);

  }


}
