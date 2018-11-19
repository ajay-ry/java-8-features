package com.exp.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFilter {

    static List<String> list = new ArrayList<String>(Arrays.asList("this","is","a","stream"));

    //map stream example
    public static void map_fun(){
        Stream map_stream = list.stream().map(i -> i.toUpperCase());
        List<String> out_stream = (List<String>) map_stream.collect(Collectors.toList());
        System.out.println(out_stream);
    }


    //filter example
    public static void filter_fun(){
        Stream filter_stream = list.stream().filter(i->i.contains("is"));
        List<String> out_stream = (List<String>) filter_stream.collect(Collectors.toList());
        System.out.println(out_stream);
    }

    //map & filter example
    public static void map_filter_fun(){
        List<String> map_filter_str = list.stream().map(i->i.toUpperCase()).filter(i->i.contains("IS")).collect(Collectors.toList());
        System.out.println(map_filter_str);
    }

    //count function
    public static void countElements(){
        long count = list.stream().map(i->i.toUpperCase()).filter(i->i.contains("IS")).count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        map_fun();
        filter_fun();
        map_filter_fun();
        countElements();
    }
}
