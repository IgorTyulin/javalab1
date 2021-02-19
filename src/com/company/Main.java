package com.company;

public class Main {

    public static void main(String[] args) {
        Complex a = new Complex(10, 3);
        Complex b = new Complex(4, 12);
        Complex c = new Complex(0, 0);
        System.out.println(c.plus(a, b).PrintA());
        System.out.println(c.minus(a, b).PrintA());
        System.out.println(c.mult(a, b).PrintA());
        System.out.println(c.div(a, b).PrintA());
        System.out.println(c.plus(a, b).PrintTG());
        System.out.println(c.minus(a, b).PrintTG());
        System.out.println(c.mult(a, b).PrintTG());
        System.out.println(c.div(a, b).PrintTG());

        int size = 5;
        Matrix matrix1 = new Matrix(size);
        Matrix matrix2 = new Matrix(size);
        Complex[][] data1 = new Complex[size][size];
        Complex[][] data2 = new Complex[size][size];
        for (int i = 0; i < size; i++){
            for (int j= 0; j < size; j++){
                data1[i][j] = new Complex(1, 2.5);
                data2[i][j] = new Complex(2, 0.4);
            }
        }

        matrix1.setMatrix(data1);
        matrix1.print();

    }
}
