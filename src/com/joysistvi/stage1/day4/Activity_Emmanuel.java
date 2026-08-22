package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity_Emmanuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mula sa user
        System.out.print("Income: ");
        int income = sc.nextInt();

        // Fixed percentages
        double foodRate = 30.0;
        double transpoRate = 5.0;
        double rentRate = 9.0;
        double utilityRate = 7.0;

        // Computation ng bawas
        double foodExpense = income * (foodRate / 100);
        double transpoExpense = income * (transpoRate / 100);
        double rentExpense = income * (rentRate / 100);
        double utilityExpense = income * (utilityRate / 100);

        // Computation ng remaining balance
        double totalExpense = foodExpense + transpoExpense + rentExpense + utilityExpense;
        int remainingBalance = (int) (income - totalExpense);

        // Display ng Result
        System.out.println("Food Allowance: " + foodRate + " %");
        System.out.println("Transportation: " + transpoRate + " %");
        System.out.println("Rent: " + rentRate + " %");
        System.out.println("Utility Bill: " + utilityRate + " %");
        System.out.println("Remaining Balance: " + remainingBalance);

        sc.close();
    }
}