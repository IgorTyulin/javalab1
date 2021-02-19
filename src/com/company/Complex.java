package com.company;

public class Complex {
    public double x;
    public double y;
    public double  r = 0, fi = 0;

    public Complex() {
        this.x = 0;
        this.y = 0;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex(double new_x){
        this.x = new_x;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //сложение по формуле: (a1 + b1i)+(a2 + b2i) = (a1 + a2)+(b1 + b2)i
    public Complex plus(Complex num1, Complex num2) {
        double a = num1.x + num2.x;
        double b = num1.y + num2.y;
        Complex final_num = new Complex(a,b);
        return final_num;
    }

    //вычитание по формуле: (a1 + b1i)+(a2 + b2i) = (a1 - a2)+(b1 - b2)i
    public Complex minus(Complex num1, Complex num2) {
        double a = num1.x - num2.x;
        double b = num1.y - num2.y;
        Complex final_num = new Complex(a,b);
        return final_num;
    }
    //умножение по формуле: (a1 + b1i)*(a2 + b2i) = (a1*a2 - b1*b2)+(b1*a2 + a1*b2)i
    public Complex mult(Complex num1, Complex num2) {
        double a = num1.x * num2.x + num1.y * num2.y * -1;
        double b = num1.y * num2.x + num1.x * num2.y;
        Complex final_num = new Complex(a,b);
        return final_num;
    }
    //деление по формуле: (a1 + b1i)/(a2 + b2i) = (a1*a2 + b1*b2)/(a2^2+b2^2)+((b1*a1 - a1*b2)/(a2^2+b2^2))i
    public Complex div(Complex num1, Complex num2) {
        double a = (num1.x * num2.x + num1.y * num2.y) / (Math.pow(num2.x, 2) + Math.pow(num2.y, 2));
        double b = (num1.y * num2.x - num1.x * num2.y) / (Math.pow(num2.x, 2) + Math.pow(num2.y, 2));
        Complex final_num = new Complex(a,b);
        return final_num;
    }
    //вывод алг формы
    public String PrintA() {
        if(y>0)
            return x + "+" + y + "i";
        else if(y == 0)
            return x + "";
        else
            return x + "" + y + "i";
    }
    //вывод триг формы
    public String PrintTG() {
        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (x > 0) {
            fi = Math.atan(y/x);
        } else {
            if (y > 0) {
                fi = Math.PI + Math.atan(y/x);
            } else {
                fi = - Math.PI + Math.atan(y/x);
            }
        }
        return r + "*(cos(" + fi + ")+sin(" + fi + ")*i)";
    }
}
