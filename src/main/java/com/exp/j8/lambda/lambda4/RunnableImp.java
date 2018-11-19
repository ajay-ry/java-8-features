package com.exp.j8.lambda.lambda4;

public class RunnableImp {
    public static void main(String[] args) {
        Runnable r = () -> {for(int i=0;i<10;i++){
            System.out.println("hello.1");
        }};

        Thread t = new Thread(r);
        t.start();

        System.out.println("------------");


        Thread t2 = new Thread(()->{for(int i=0;i<10;i++){
            System.out.println("hello.2");
        }});
        t2.start();
    }
}
