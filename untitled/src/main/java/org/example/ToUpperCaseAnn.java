package org.example;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToUpperCaseAnn {
    String info() default "No String value";
}
