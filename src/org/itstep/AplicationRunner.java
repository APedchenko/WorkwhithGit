package org.itstep;

public class AplicationRunner {
    String text;

    public static void main(String[] args) {
        someMethod("Hi! My name is Artem!");
        someMethod("Hi, i am Judoka");


    }

    static void someMethod(String msg) {
        System.out.println(msg);
    }

}


