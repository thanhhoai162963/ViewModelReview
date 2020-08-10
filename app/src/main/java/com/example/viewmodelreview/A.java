package com.example.viewmodelreview;

public class A {
    private static A a = null;


    public A getInstace() {
        if (a == null) {
             a = new A();
        }
        return a;
    }
}
