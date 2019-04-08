package se.hh.aoop.test.assignment1.exercise12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import se.hh.aoop.src.assignment1.exercise12.Filter;

class FilterTest {

    @Test
    public void FilterTest(){
        String[] s = {"advanced", "oop", "pie", "hi", "b", "exercise", "assignment", "bye"};
        s = Filter.filter(s, x -> x.length() <= 3);
        for (String a : s) {
            assertEquals(a.length(), 1, 2);
        }
    }

}