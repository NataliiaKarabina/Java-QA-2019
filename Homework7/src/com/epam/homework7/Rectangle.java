package com.epam.homework7;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getName() + ": color = " + this.getColor();
    }

    @Override
    public double calcArea() {
        return (double) Math.round(width * height * 100) / 100;
    }
}