package se.hh.aoop.src.assignment1.exercise12;

import java.util.Arrays;

public interface Filter {

    boolean accept(String x);

    public static String[] filter(String[] a, Filter f) {
        return Arrays.stream(a).filter(f::accept).toArray(String[]::new);
    }

}
