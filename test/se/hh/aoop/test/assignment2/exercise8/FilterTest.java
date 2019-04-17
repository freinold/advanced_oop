package se.hh.aoop.test.assignment2.exercise8;

import org.junit.jupiter.api.Test;
import se.hh.aoop.src.assignment2.exercise8.Filter;
import se.hh.aoop.src.assignment2.exercise8.FilterSize;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {

    @Test
    public void testFilter(){
        Filter f = new FilterSize();
        ArrayList<String> s = new ArrayList<>();
        s.add("banana");
        s.add("marina");
        s.add("hey");
        s.add("hi");
        s.add("a");
        s.add("test");
        ArrayList<String> r = f.filter(s);
        System.out.println(r);
        assertEquals(r.size(), 3);
    }
}