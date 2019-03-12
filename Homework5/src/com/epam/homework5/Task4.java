package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());
        int[] array = createArrayIntegers(size);

        System.out.println("Array before division =" + Arrays.toString(array));
        arrayDivision(array);

    }

    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 60) - 20;
        }

        return array;
    }

    static void arrayDivision(int[] array) {
        int[] posArray = new int[0];
        int[] negArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                posArray = addNum(posArray, array[i]);

            }
            if (array[i] < 0) {
                negArray = addNum(negArray, array[i]);

            }

        }

        System.out.println("Positive array -> " + Arrays.toString(posArray));
        System.out.println("Negative array -> " + Arrays.toString(negArray));

    }

    static int[] addNum(int[] arr, int num) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = num;
        return arr;
    }

}

