package se.hh.aoop.src.assignment3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver {

    private String saveHelper(Object o, int indent) throws InvocationTargetException, IllegalAccessException {
        String resultXML = "";
        Class<?> c = o.getClass();
        Element e = c.getAnnotation(Element.class);
        String indentString = "";
        for (int i = 0; i < indent; i++) {
            indentString += "\t";
        }
        if (e != null) {
            resultXML += indentString + String.format("<%s", e.name());
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                ElementField elementField = m.getAnnotation(ElementField.class);
                if (elementField != null) {
                    resultXML += String.format(" %s=\"%s\"", elementField.name(), m.invoke(o));
                }
            }
            boolean subElementsPresent = false;
            for (Method m : methods) {
                SubElements subElements = m.getAnnotation(SubElements.class);
                if (subElements != null) {
                    Object[] subobjects = (Object[]) m.invoke(o);
                    if (subobjects != null) {
                        subElementsPresent = true;
                        resultXML += ">\n";
                        resultXML += indentString + String.format("\t<%s>\n", subElements.name());
                        for (Object subobject : subobjects) {
                            resultXML += saveHelper(subobject, indent + 2);
                        }
                        resultXML += indentString + String.format("\t</%s>\n", subElements.name());
                    }
                }
            }
            if (subElementsPresent) {
                resultXML += indentString + String.format("</%s>\n", e.name());
            } else {
                resultXML += "/>\n";
            }
        }
        return resultXML;
    }

    public String save(Object o) throws InvocationTargetException, IllegalAccessException {
        return saveHelper(o, 0);
    }

}
