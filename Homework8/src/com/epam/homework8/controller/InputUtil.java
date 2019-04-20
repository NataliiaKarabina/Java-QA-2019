package com.epam.homework8.controller;

import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);
    private static Scanner scText = new Scanner(System.in);

    public static int inputInt() {
        return sc.nextInt();
    }

    public static String inputString() {
        return scText.nextLine();
    }

}
