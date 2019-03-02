package Homework3;

public class Figure2 {
    public static void main(String[] args) {

        int size = 7;
        int i = 1;

        while (i <= size) {
            int j = 1;
            while (j <= size) {
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