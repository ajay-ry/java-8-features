package com.exp.j8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    static List<String> element_list1 = new ArrayList<String>(Arrays.asList("this","is","a","stream"));
    static List<Integer> element_list2 = new ArrayList<Integer>(Arrays.asList(34,56,12,3,4,98));

    //Sorting the elements in a list
    public static void sorted_list(){
        List<String> sorted_list_1 = element_list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted_list_1);

        List<Integer> sorted_list_2 = element_list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted_list_2);

    }


    //approach 2. sorting the elements in descending order. parameterized sorted function.
    public static void sorted_list_2(){
        List<Integer> sorted_list = element_list2.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sorted_list);
    }

    public static void main(String[] args) {
        sorted_list();
        sorted_list_2();
    }

}
