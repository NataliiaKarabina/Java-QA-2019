package com.epam.homework4;

import java.util.Scanner;

public class TaskII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pyramid height  -> ");
        int height = sc.nextInt();
        pyramidBuilding(height);
    }

    public static void pyramidBuilding(int height) {
        int row = 1;
        System.out.println("Your Pyramid -> ");
        for (int i = height; i > 0; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            row++;
        }
    }
}
