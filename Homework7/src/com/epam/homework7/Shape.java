package com.epam.homework7;

public class Shape {

    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "class = " + this.getClass().getName() + ": color = " + this.color;
    }

    public double calcArea() {
        System.out.println("The area of the figure is not defined ");
        return 0.0;
    }
}




