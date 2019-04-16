package se.hh.aoop.src.assignment2.exercise12;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintVisitor<T> implements TreeVisitor<T, String, Integer>{


    @Override
    public String visit(Tree<T> t, Integer val) {
        return t.accept(this,val);
    }

    @Override
    public String visit(Leaf<T> l, Integer val) {
        String result = "";
        for(int i = 0; i < val; i++){
            result += "   ";
        }
        result+= l.toString();
        return result;
    }

    @Override
    public String visit(Node<T> n, Integer val) {
        String result = "";
        for(int i = 0; i < val; i++){
            result += "   ";
        }

        result += n.toString()+ "\n";
        val++;

        for(Tree c : n.getChildren()){
            result += c.accept(this,val);
            result += "\n";
        }

        return result;
    }
}

