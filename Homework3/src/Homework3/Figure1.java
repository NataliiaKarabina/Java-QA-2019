package Homework3;

public class Figure1 {
    public static void main(String[] args) {

        int size = 1;
        int i = 1;

        while (size <= 7) {
            int j = size;
            while (j >= 1) {
                System.out.print("*");
                j--;
            }
            size++;
            System.out.println();
        }

        i = 2;

        while (i <= size) {
            int j = size - 1;
            while (j >= 1) {
                if (j >= i)
                    System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }

    }

}


