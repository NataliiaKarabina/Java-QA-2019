package com.epam.homework7;

public abstract class Shape implements Drawable {

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

    @Override
    public void draw() {
        System.out.println(this + " -> area = " + this.calcArea());
    }

    public abstract double calcArea();
}





