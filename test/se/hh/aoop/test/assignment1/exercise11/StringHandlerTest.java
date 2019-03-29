package se.hh.aoop.test.assignment1.exercise11;

import org.junit.jupiter.api.Test;
import se.hh.aoop.assignment1.exercise11.StringHandler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class StringHandlerTest {

    @Test
    public void maximumTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        Random random = new Random();
        int numberOfElements = 200;
        for (int i = 1; i < numberOfElements + 1; i++) {
            arrayList.add(Integer.toString(random.nextInt(i)));
        }
        Comparator<String> comparator = Comparator.comparingInt(Integer::parseInt);
        String maximum = StringHandler.maximum(arrayList, comparator);
        System.out.println("maximum = " + maximum);
        System.out.println("arrayList = " + arrayList);
    }

}
