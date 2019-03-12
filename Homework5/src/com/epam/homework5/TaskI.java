package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());
        int[] array = createArrayIntegers(size);

        System.out.println("Array =" + Arrays.toString(array));
        System.out.println("Average =" + avrNum(array));
        System.out.println("Number of elements =" + elNum(array));
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

    static int avrNum(int[] array) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        average = (sum) / array.length;
        return (average);

    }

    static int elNum(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avrNum(array)) {
                num++;
            }
        }
        return (num);

    }

}

