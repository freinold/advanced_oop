package se.hh.aoop.test.assignment1.exercise4;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import se.hh.aoop.assignment1.exercise4.IntStack;

public class IntStackTest {

  @Test
  public void basicTest() {
    IntStack s = new IntStack();
    int val1 = -1;
    int val2 = 0;
    int val3 = 1;
    s.push(val1);
    s.push(val2);
    s.push(val3);
    assertEquals(val3, s.pop());
    assertEquals(val2, s.pop());
    assertEquals(val1, s.pop());
  }

  @Test
  public void arrayTest() {
    IntStack s = new IntStack();
    int[] arr1 = {-1, 0, 1};
    int[] arr2 = {-2, 2};
    s.push(arr1.length, arr1);
    s.push(arr2.length, arr2);
    assertEquals(Arrays.toString(s.pop(arr2.length)), Arrays.toString(arr2));
    assertEquals(Arrays.toString(s.pop(arr1.length)), Arrays.toString(arr1));
  }

}
