package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());
        int[] array = createArrayIntegers(size);

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Number of odd elements = " + oddNum(array));
        System.out.println("Sum of odd elements = " + oddSum(array));
    }

    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 12;
        }

        return array;
    }

    static Integer oddNum(int[] array) {
        int sum = 0;
        int n = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                n++;
            }
        }
        return n;
    }

    static Integer oddSum(int[] array) {
        int sum = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                n++;
            }
        }
        return sum;

    }
}



