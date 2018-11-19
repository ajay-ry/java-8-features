package com.exp.j8.lambda.lambda1;

public class Hello {
    public static void main(String[] args) {
        HelloInterface lambda = () -> {System.out.println("hello");};
        lambda.sayHello();
    }


}
