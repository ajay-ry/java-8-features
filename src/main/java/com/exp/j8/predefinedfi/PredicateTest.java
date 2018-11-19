package com.exp.j8.predefinedfi;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i>40;

        System.out.println(p1.test(20));
        Predicate<Integer> flag = p1.and(p2);
        System.out.println(flag.test(45));
    }
}
