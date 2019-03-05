package com.epam.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string  ->");
        String str = sc.next();
        System.out.println("Unique characters -> " + uniqueCharacters(str));
    }

    public static String uniqueCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j))
                    str = str.replace(String.valueOf(str.charAt(j)), "");
                j++;
            }
            i++;
            sb.append(str);
        }
        return str;
    }

}