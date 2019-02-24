package com.epam.homework2;

public class Task2 {
    public static void main(String[] args) {
        int number = 123;

        String str = Integer.toString(number);
        String reverse = new StringBuffer(str).reverse().toString();
        int revNumber = Integer.parseInt(reverse);

        System.out.println("result = " + (number - revNumber));

    }
}
