package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity7_MultiplicationScanner_Emmanuel {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a number for multiplication table: ");
     int number = scanner.nextInt();

     System.out.println("Multiplication Table of " + number);
     for (int i = 1; i <= 10; i++) {
        System.out.println(number + " * " + i + " = " + (number * i));
     }

     scanner.close();
   }
}