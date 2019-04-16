package se.hh.aoop.src.assignment2.exercise8;

public abstract class Filter {

    public abstract boolean accept(String x);

    public boolean filter(String x){
        return accept(x);
    }
}
