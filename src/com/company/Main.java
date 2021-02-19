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
        System.out.println("");

        int size = 5;
        Matrix mat1 = new Matrix(size);
        Matrix mat2 = new Matrix(size);
        Complex[][] data1 = new Complex[size][size];
        Complex[][] data2 = new Complex[size][size];
        for (int i = 0; i < size; i++){
            for (int j= 0; j < size; j++){
                data1[i][j] = new Complex(1, 0);
                data2[i][j] = new Complex(2, 0);
            }
        }
        mat1.setMatrix(data1);
        mat1.print();
        System.out.println("");
        mat2.setMatrix(data2);
        mat2.print();
        System.out.println("");
        Matrix testmat = mat1.plus(mat1, mat2);
        testmat.print();
        System.out.println("");
        Matrix testmat2 = mat1.minus(mat1, mat2);
        testmat2.print();
        System.out.println("");
        Matrix testmat3 = mat1.mult(mat1, mat2);
        testmat3.print();
        System.out.println("");
        Matrix testmat4 = mat1.div(mat1, mat2);
        testmat4.print();
        System.out.println("");

    }
}
