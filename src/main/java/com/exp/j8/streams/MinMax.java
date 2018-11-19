package com.exp.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

    static List<Integer> list = new ArrayList<Integer>(Arrays.asList(23,42,1,2,56,3));


    public static void min(){
        int min_ele = list.stream().min((i1, i2)->i1.compareTo(i2)).get();
        System.out.println(min_ele);
    }

    public static void max(){
        int max_ele = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max_ele);
    }

    public static void main(String[] args) {
        min();
        max();
    }
}
