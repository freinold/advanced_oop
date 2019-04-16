package se.hh.aoop.src.assignment2.exercise8;

import java.util.ArrayList;

public abstract class Filter<T> {

    public abstract boolean accept(T x);

    public ArrayList<T> filter(ArrayList<T> t){
        ArrayList<T> result = new ArrayList<>();
        for(T x : t){
            if(accept(x)) result.add(x);
        }
        return result;
    }
}
