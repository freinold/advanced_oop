package se.hh.aoop.src.assignment2.exercise8;

public class FilterSize extends Filter{

    public boolean accept(String x){
        if(x.length() <= 3) return true;
        else return false;
    }
}
