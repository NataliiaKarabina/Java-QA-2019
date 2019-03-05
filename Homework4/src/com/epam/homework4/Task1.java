package com.epam.homework4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer digit  -> ");
        int digit = sc.nextInt();
        System.out.println("Binary string -> " + integerToBinary(digit));
    }

    public static String integerToBinary(int digit) {
        StringBuilder sb = new StringBuilder();
        if (digit == 0)
            return "0";
        while (digit >= 1) {
            sb.append(digit % 2);
            digit = digit / 2;

        }
        return sb.reverse().toString();
    }
}