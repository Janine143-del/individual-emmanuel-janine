package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity8_Emmanuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[] num = new int[5];
         int sum = 0;

         // Input
         System.out.println("Enter 5 numbers:");
         for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            sum += num[i];
        }

         // Display, Sum, Highest and Lowest
         System.out.println("\nYou entered:");
         int high = num[0];
         int low = num[0];

         for (int i = 0; i < 5; i++) {
            System.out.println("Index " + i + ": " + num[i]);
            if (num[i] > high) high = num[i];
            if (num[i] < low) low = num[i];
        }

         System.out.println("\nSum = " + sum);
         System.out.println("Average = " + (sum / 5.0));
         System.out.println("Highest = " + high);
         System.out.println("Lowest = " + low);

        sc.close();
    }
}
