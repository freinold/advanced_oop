package se.hh.aoop.src.assignment3.exercise4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver {

    public String save(Object o) {
        String toReturn = "";
        try {
            toReturn = save(o, 0);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return toReturn;
    }

    private String save(Object o, int indent)  throws InvocationTargetException, IllegalAccessException {
        StringBuilder result = new StringBuilder();
        Class<?> c = o.getClass();
        Element e = c.getAnnotation(Element.class);
        if (e != null) {
            StringBuilder indentString = new StringBuilder();
            for (int i = 0; i < indent; i++) {
                indentString.append("\t\t");
            }

            result.append(indentString).append(String.format("<%s", e.name()));

            Method[] methods = c.getMethods();
            for (Method m : methods) {
                ElementField elementField = m.getAnnotation(ElementField.class);
                if (elementField != null) {
                    result.append(String.format(" %s=\"%s\"", elementField.name(), m.invoke(o)));
                }
            }

            boolean subElementsPresent = false;
            for (Method m : methods) {
                SubElements subElements = m.getAnnotation(SubElements.class);
                if (subElements != null) {
                    Object[] subObjects = (Object[]) m.invoke(o);
                    if (subObjects != null) {
                        subElementsPresent = true;
                        result.append(">\n");
                        result.append(indentString).append(String.format("\t<%s>\n", subElements.name()));
                        for (Object subObject : subObjects) {
                            result.append(save(subObject, indent + 1));
                        }
                        result.append(indentString).append(String.format("\t</%s>\n", subElements.name()));
                    }
                }
            }

            if (subElementsPresent) {
                result.append(indentString).append(String.format("</%s>\n", e.name()));
            } else {
                result.append("/>\n");
            }
        }
        return result.toString();
    }

}
