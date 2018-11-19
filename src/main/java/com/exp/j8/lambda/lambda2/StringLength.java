package com.exp.j8.lambda.lambda2;

public class StringLength {
    public static void main(String[] args) {
        StringInterface len = s ->  s.length();
        System.out.println(len.getLenght("hello"));
    }
}
