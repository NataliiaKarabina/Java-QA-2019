package Homework3;

public class Figure4 {
    public static void main(String[] args) {

        int size = 7;
        int i = 0;

        while (i < size) {
            int j = size - 1;
            while (j >= 0) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j--;
            }
            System.out.println();
            i++;
        }

        i = 1;

        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
