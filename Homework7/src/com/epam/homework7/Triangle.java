package com.epam.homework7;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getName() + ": color = " + this.getColor();
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return (double) Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100) / 100;
    }
}
