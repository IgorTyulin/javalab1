package com.company;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(10, 3);
        Complex b = new Complex(4, 12);
        Complex c = new Complex(0, 0);
        System.out.println(c.plus(a, b));
        System.out.println(c.minus(a, b));
        System.out.println(c.mult(a, b));
        System.out.println(c.div(a, b));
    }
}
