package Homework3;

public class Figure5 {
    public static void main(String[] args) {

            int size = 7;
            int i = 0;
            while (i < size) {
                int j = size;
                while (j > i) {
                    System.out.print(" ");
                    j--;
                }
                int k = 0;
                while (k <= 2 * i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }

            i = 0;
            while (i < size) {
                int j = size;
                while (j > i) {
                    System.out.print(" ");
                    j--;
                }
                int k = 0;
                while (k <= 2 * i) {
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }
        }
}
