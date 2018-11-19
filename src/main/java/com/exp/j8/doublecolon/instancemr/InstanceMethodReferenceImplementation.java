package com.exp.j8.doublecolon.instancemr;

public class InstanceMethodReferenceImplementation {

    public void method_implementation(){
        for(int i=0;i<10;i++)
            System.out.println("hello:"+i);
    }

    public static void main(String[] args) {
        InstanceMethodReferenceImplementation imr = new InstanceMethodReferenceImplementation();
        Runnable r = imr::method_implementation;
        Thread t = new Thread(r);
        t.start();
    }
}
