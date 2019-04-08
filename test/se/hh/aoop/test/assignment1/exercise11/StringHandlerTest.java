package se.hh.aoop.test.assignment1.exercise11;

import org.junit.jupiter.api.Test;

import se.hh.aoop.src.assignment1.exercise11.StringHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class StringHandlerTest {

    @Test
    public void maximumTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("test/se/hh/aoop/test/assignment1/exercise11/german.txt"))) {
            stream.forEach(arrayList::add);
        } catch (IOException ioException) {
            System.out.println("ioException = " + ioException);
        }
        Comparator<String> comparator = Comparator.comparing(String::length);
        String maximum = StringHandler.maximum(arrayList, comparator);
        System.out.println("maximum = " + maximum);
    }

}
