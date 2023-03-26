package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ToUpperCaseAnnProcessor{

    public List<String> process(Object instance) throws IllegalAccessException {
        Field[] clazz = instance.getClass().getDeclaredFields();
        List<String> result = new ArrayList<>();
        for (Field m : clazz) {
            //Так лучше не делать, но вдруг нам будут нужны даже приватные поля через рефлексию
            m.setAccessible(true);
            if (m.isAnnotationPresent(ToUpperCaseAnn.class)) {
                result.add(m.get(instance).toString().toUpperCase());
            }
        }
        return result;
    }
}
