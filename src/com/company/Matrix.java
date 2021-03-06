package com.company;

public class Matrix {
    private int size;
    private Complex[][] matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new Complex[size][size];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j].PrintA());
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void setMatrix(Complex[][] matnew) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = new Complex(matnew[i][j].getX(), matnew[i][j].getY());
            }
        }
    }

    public Matrix plus(Matrix a, Matrix b) {
        Complex[][] data = new Complex[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = a.matrix[i][j].plus(a.matrix[i][j], b.matrix[i][j]);
            }
        }
        Matrix matnew = new Matrix(size);
        matnew.setMatrix(data);
        return matnew;
    }

    public Matrix minus(Matrix a, Matrix b) {
        Complex[][] data = new Complex[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j]= a.matrix[i][j].minus(a.matrix[i][j],b.matrix[i][j]);
            }
        }
        Matrix matnew = new Matrix(size);
        matnew.setMatrix(data);
        return matnew;
    }

    public Matrix mult(Matrix a, Matrix b){
        Complex[][] data = new Complex[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Complex val = new Complex();
                for (int k = 0; k < size; k++){
                    val = val.plus(val, matrix[i][k].mult(a.matrix[i][k], b.matrix[k][j]));
                }
                data[i][j] = val;
            }
        }
        Matrix matnew = new Matrix(size);
        matnew.setMatrix(data);
        return matnew;
    }

    public Matrix div(Matrix a, Matrix b){
        Complex[][] data = new Complex[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Complex val = new Complex();
                for (int k = 0; k < size; k++){
                    val = val.plus(val, matrix[i][k].div(a.matrix[i][k], b.matrix[k][j]));
                }
                data[i][j] = val;
            }
        }
        Matrix matnew = new Matrix(size);
        matnew.setMatrix(data);
        return matnew;
    }
}

