package Homework3;

public class Figure3 {

    public static void main(String[] args) {

        int size = 7;
        int i = 0;

        while (i < size) {
            int j = size;
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
    }
}
