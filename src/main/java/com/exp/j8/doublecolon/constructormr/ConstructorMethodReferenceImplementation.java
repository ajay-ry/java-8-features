package com.exp.j8.doublecolon.constructormr;

import com.exp.j8.doublecolon.staticmr.MRInterface;

public class ConstructorMethodReferenceImplementation {

    public ConstructorMethodReferenceImplementation(){
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {
        MRInterface mri = ConstructorMethodReferenceImplementation::new;
        mri.m1();
    }
}
