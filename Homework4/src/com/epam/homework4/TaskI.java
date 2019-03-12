package com.epam.homework4;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer digit  -> ");
        int digit = sc.nextInt();
        System.out.println("Wrapped the last two digits of the number -> " + numberLast(digit));
    }

    static String numberLast(int digit) {
        StringBuilder sb = new StringBuilder();
        if (digit == 0)
            return "0";
        while (digit >= 100) {
            sb.append(digit % 10);
            digit = digit / 10;

        }
        return sb.toString();
    }

}
