package se.hh.aoop.src.assignment3;

import java.lang.reflect.Method;

public class Saver {

    public String save(Object o){
        String resultXML = "";
        Class<?> c = o.getClass();
        Element e = c.getAnnotation(Element.class);
        if(e != null) {
            resultXML += String.format("<%s", e.name());
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                ElementField elementField = m.getAnnotation(ElementField.class);
                if (elementField != null) {
                    resultXML += String.format(" value=\")
                }
            }
        }
        return resultXML;
    }

}
