package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());
        int[] array = createArrayIntegers(size);

        System.out.println("Array before revers =" + Arrays.toString(array));
        System.out.println("Array after revers =" + Arrays.toString(reverseArrayIntegers(array)));
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

    static int[] reverseArrayIntegers(int[] array) {
        int[] arrayRevers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayRevers[i] = array[array.length - 1 - i];
        }

        return arrayRevers;
    }
}
