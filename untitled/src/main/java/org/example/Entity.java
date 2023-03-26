package org.example;

public class Entity {

    @ToUpperCaseAnn()
    public String publicAnnotatedField = "public_Annotated_Field";

    public String publicField = "public_Field";

    private String privateField = "private_Field";

    @ToUpperCaseAnn()
    private String privateAnnotatedField = "private_Annotated_Field";
}
