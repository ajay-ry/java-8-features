package com.exp.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    static List<String> list = new ArrayList<String>(Arrays.asList("this","is","a","stream"));

    public static void foreach_fun(){
        list.stream().forEach(i -> System.out.println(i));
    }

    public static void main(String[] args) {
        foreach_fun();
    }

}
