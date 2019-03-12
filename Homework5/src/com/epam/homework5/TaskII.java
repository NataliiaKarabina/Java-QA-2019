package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 -> ");
        int size1 = Integer.parseInt(sc.next());
        System.out.println("Enter size of array 2 -> ");
        int size2 = Integer.parseInt(sc.next());

        int[] array1 = createArrayIntegers(size1);
        int[] array2 = createArrayIntegers(size2);
        int[] array3 = concatArrays(array1, array2);

        System.out.println("Array first = " + Arrays.toString(array1));
        System.out.println("Array second = " + Arrays.toString(array2));
        System.out.println("Concatenate arrays = " + Arrays.toString(array3));

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

    public static int[] concatArrays(int[] array1, int[] array2) {

        if (array1 == null) return array2;
        if (array2 == null) return array1;
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        return array3;

    }
}
