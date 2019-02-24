package com.epam.homework2;

public class Task3 {
    public static void main(String[] args) {
        double pounds = 150;
        double grams = pounds * 453.6;

        System.out.printf("%.1f pounds = %d kilos and %d grams ", pounds, (int)grams / 1000, (int)grams % 1000);


    }
}
