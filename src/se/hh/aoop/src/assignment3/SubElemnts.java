package se.hh.aoop.src.assignment3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SubElemnts {
    String name();
}

