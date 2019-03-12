package com.epam.homework5;

import java.util.Arrays;
import java.util.Scanner;


public class TaskIII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array -> ");
        int size = Integer.parseInt(sc.next());
        int[] array = createArrayIntegers(size);

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Max element = " + getMax(array));
        System.out.println("Min element = " + getMin(array));
        Arrays.sort(array);
        System.out.println("Array remove duplicates = " + Arrays.toString(getUniqueValues
                (array)));

    }

    static int[] createArrayIntegers(int size) {
        if (size <= 0) {
            return new int[]{};
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 40) - 8;
        }
        return array;
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int value : array)
            if (max < value)
                max = value;

        return max;
    }

    static int getMin(int[] array) {
        int min = array[0];
        for (int value : array)
            if (min > value)
                min = value;

        return min;
    }

    public static int[] getUniqueValues(int[] array) {

        int j = 0;
        int i = 1;

        if (array.length < 2) {
            return array;
        }
        while (i < array.length) {
            if (array[i] == array[j]) {
                i++;
            } else {
                array[++j] = array[i++];
            }
        }
        int[] array2 = new int[j + 1];
        for (int k = 0; k < array2.length; k++) {
            array2[k] = array[k];
        }
        return array2;

    }

}

