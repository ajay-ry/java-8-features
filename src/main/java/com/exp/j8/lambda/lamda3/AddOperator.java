package com.exp.j8.lambda.lamda3;

public class AddOperator {
    public static void main(String[] args) {
        AdderInterface ad = (a, b) -> a+b;
        System.out.println(ad.sum(10,20));
    }


}
