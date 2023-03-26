package org.tests;

import org.example.Entity;
import org.example.ToUpperCaseAnnProcessor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    Entity entity;
    ToUpperCaseAnnProcessor toUpperCaseAnnProcessor;

    List<String> result;

    @Before
    public void setUp() throws IllegalAccessException {
       entity = new Entity();
       toUpperCaseAnnProcessor = new ToUpperCaseAnnProcessor();
       result = toUpperCaseAnnProcessor.process(entity);
    }

    @Test
    public void checkAmountAnnotationField() throws IllegalAccessException {
        assertEquals(2, result.size(), "Нам вернулись только аннотированные поля(2 из 4х)");
    }

    @Test
    public void checkPublicAnnotationField() throws IllegalAccessException {
        assertEquals("PUBLIC_ANNOTATED_FIELD", result.get(0), "Приватное аннотированное поле");
    }
    @Test
    public void checkPrivateAnnotationField() throws IllegalAccessException {
        assertEquals("PRIVATE_ANNOTATED_FIELD", result.get(1), "Приватное аннотированное поле");
    }
}
