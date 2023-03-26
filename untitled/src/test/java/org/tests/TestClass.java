package org.tests;

import org.example.Entity;
import org.example.ToUpperCaseAnnProcessor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    Entity entity;
    ToUpperCaseAnnProcessor toUpperCaseAnnProcessor;
    @Before
    public void setUp() {
       entity = new Entity();
       toUpperCaseAnnProcessor = new ToUpperCaseAnnProcessor();
    }

    @Test
    public void checkAnnotationField() throws IllegalAccessException {
        var result = toUpperCaseAnnProcessor.process(entity);
        assertEquals(2, result.size(), "Нам вернулись только аннотированные поля(2 из 4х)");
        assertEquals("PUBLIC_ANNOTATED_FIELD", result.get(0), "Публичное аннотированное поле");
        assertEquals("PRIVATE_ANNOTATED_FIELD", result.get(1), "Приватное аннотированное поле");
    }
}
