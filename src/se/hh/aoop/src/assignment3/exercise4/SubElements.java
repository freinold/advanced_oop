package se.hh.aoop.src.assignment3.exercise4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SubElements {
    String name();
}

