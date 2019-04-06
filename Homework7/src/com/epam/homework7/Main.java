package com.epam.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] figures = {
                new Rectangle(5, 4, "brown"),
                new Rectangle(7, 5, "red"),
                new Rectangle(6, 4, "orange"),
                new Rectangle(8, 5, "pink"),
                new Circle(8.0, "blue"),
                new Circle(5.0, "yellow"),
                new Circle(7.2, "green"),
                new Triangle(7.1, 8.4, 9.2, "cyan"),
                new Triangle(4.5, 5.5, 6.0, "black")

        };
        printFigures(figures);
        System.out.println("---------------------Sort by area------------------------------------");
        Arrays.sort(figures, new CompareShapeByArea());
        printFigures(figures);
        System.out.println("---------------------Sort by color-----------------------------------");
        Arrays.sort(figures, new CompareShapeByColor());
        printFigures(figures);
        System.out.println("---------------------------------------------------------------------");

        System.out.println("The area of all figures = " + calculateAreaOfAllFigures(figures));
        System.out.println("The area of each figure type = " + Arrays.toString(calculateAreaOfFigureType(figures)));
    }

    public static void printFigures(Shape[] figures) {
        for (Shape elem : figures) {
            elem.draw();
        }
    }

    public static double calculateAreaOfAllFigures(Shape[] figures) {
        double s = 0;
        for (Shape elem : figures) {
            s += elem.calcArea();
        }
        return s;
    }

    public static double[] calculateAreaOfFigureType(Shape[] figures) {
        double[] area = {0, 0, 0};
        for (Shape elem : figures) {
            if (elem instanceof Rectangle) {
                area[0] += elem.calcArea();
            } else if (elem instanceof Circle) {
                area[1] += elem.calcArea();
            } else {
                area[2] += elem.calcArea();
            }
        }
        return area;
    }

}
