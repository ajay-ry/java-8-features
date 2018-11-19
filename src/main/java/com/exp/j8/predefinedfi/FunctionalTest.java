package com.exp.j8.predefinedfi;

import java.util.function.Function;

public class FunctionalTest {
    public static void main(String[] args) {
        //Function generics include parameter type and return type.
        Function<String,Integer> fun = s -> s.length();
        System.out.println(fun.apply("hello"));
    }
}
