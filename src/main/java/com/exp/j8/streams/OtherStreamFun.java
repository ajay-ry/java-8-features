package com.exp.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OtherStreamFun {


    public static void toArr(){
        List<String> list = new ArrayList<String>(Arrays.asList("this","is","a","stream"));
        String[] str_arr = list.stream().toArray(String[]::new);
        System.out.println(str_arr.length);
    }


    public static void create_stream(){
        Stream<String> stream = Stream.of("creating","a","stream");
        stream.forEach(i-> System.out.println(i));
    }

    public static void main(String[] args) {
        toArr();
        create_stream();
    }
}
