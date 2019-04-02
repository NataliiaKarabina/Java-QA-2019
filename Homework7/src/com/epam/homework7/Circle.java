package com.epam.homework7;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getName() + ": color = " + this.getColor();
    }

    @Override
    public double calcArea() {
        return (double) Math.round((Math.PI * Math.pow(radius, 2)) * 100) / 100;
    }
}