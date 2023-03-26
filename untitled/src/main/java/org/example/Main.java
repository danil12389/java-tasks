package org.example;

public class Main {
    @ToUpperCaseAnn()
    static String ts = "abs";
    public static void main(String[] args) {
        System.out.println(ts);
    }
}