package com.exp.j8.doublecolon.staticmr;

public class StaticMedthodReference {

    public static void m1_imp(){
        System.out.println("method implementation");
    }

    public static void main(String[] args) {
        //StaticMethodReference should be a functional interface
        MRInterface mri = StaticMedthodReference::m1_imp;
        mri.m1();
    }
}
