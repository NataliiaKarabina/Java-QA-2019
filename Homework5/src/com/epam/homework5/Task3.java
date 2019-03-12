package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());

        int[] array1 = createArrayInteger(size);
        int[] array2 = createArrayInteger(size);
        int[] arraysSum = makeSum(array1, array2);

        System.out.println("Array first =" + Arrays.toString(array1));
        System.out.println("Array second =" + Arrays.toString(array2));
        System.out.println("Arrays sum =" + Arrays.toString(arraysSum));

    }

    static int[] createArrayInteger(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 12;
        }

        return array;
    }


    static int[] makeSum(int[] array1, int[] array2) {

        int[] array = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array[i] = array1[i] + array2[i];
        }

        return array;
    }
}
