package com.epam.homework2;

import java.text.DecimalFormat;

public class Task4 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        double amount, profit;
        int customerDeposit = 10000;
        double rate = 0.12;
        int line =  6;

        //Formula for deposits with monthly capitalization
        amount = customerDeposit * Math.pow((1 + rate / 12), line);
        profit = amount - customerDeposit;

        System.out.println("Profit = " + f.format(profit));
    }
}
