package se.hh.aoop.src.assignment1.exercise11;

import java.util.ArrayList;
import java.util.Comparator;

public class StringHandler {

    public static String maximum(ArrayList<String> a, Comparator<String> c) {
        if (a.isEmpty()) {
            throw new IllegalArgumentException("ArrayList a must not be empty.");
        }
        String maximum = a.get(0);
        for (String string : a) {
            maximum = c.compare(string, maximum) > 0 ? string : maximum;
        }
        return maximum;
    }

}
