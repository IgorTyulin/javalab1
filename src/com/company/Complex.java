package com.company;

public class Complex {
    public double x;
    public double y;
    //конструктор
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //сложение по формуле: (a1 + b1i)+(a2 + b2i) = (a1 + a2)+(b1 + b2)i
    public Complex plus(Complex num1, Complex num2) {
        double a = num1.x + num2.x;
        double b = num1.y + num2.y;
        return new Complex(a,b);
    }
    //вычитание по формуле: (a1 + b1i)+(a2 + b2i) = (a1 - a2)+(b1 - b2)i
    public Complex minus(Complex num1, Complex num2) {
        double a = num1.x - num2.x;
        double b = num1.y - num2.y;
        return new Complex(a,b);
    }
    //умножение по формуле: (a1 + b1i)*(a2 + b2i) = (a1*a2 - b1*b2)+(b1*a2 + a1*b2)i
    public Complex mult(Complex num1, Complex num2) {
        double a = num1.x * num2.x + num1.y * num2.y * -1;
        double b = num1.y * num2.x + num1.x * num2.y;
        return new Complex(a,b);
    }
    //деление по формуле: (a1 + b1i)/(a2 + b2i) = (a1*a2 + b1*b2)/(a2^2+b2^2)+((b1*a1 - a1*b2)/(a2^2+b2^2))i
    public Complex div(Complex num1, Complex num2) {
        double a = (num1.x * num2.x + num1.y * num2.y) / (Math.pow(num2.x, 2) + Math.pow(num2.y, 2));
        double b = (num1.y * num2.x - num1.x * num2.y) / (Math.pow(num2.x, 2) + Math.pow(num2.y, 2));
        return new Complex(a,b);
    }

    @Override
    public String toString() {
        if(y>=0)
            return x + "+" + y + "i";
        else
            return x + "" + y + "i";
    }
}
