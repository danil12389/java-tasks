package org.example;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.SOURCE)
public @interface ToUpperCaseAnn {
    String info() default "No String value";
}
