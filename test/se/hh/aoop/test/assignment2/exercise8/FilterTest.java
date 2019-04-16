package se.hh.aoop.test.assignment2.exercise8;

import org.junit.jupiter.api.Test;
import se.hh.aoop.src.assignment2.exercise8.Filter;
import se.hh.aoop.src.assignment2.exercise8.FilterSize;

public class FilterTest {

    @Test
    public void main(){
        Filter f = new FilterSize();
        assert(!f.filter("banana"));
        assert(f.filter("hi"));
        assert(f.filter("a"));
    }
}
