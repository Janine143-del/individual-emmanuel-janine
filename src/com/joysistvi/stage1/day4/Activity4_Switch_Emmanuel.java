package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity4_Switch_Emmanuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the PUP Student Portal Menu
        System.out.println("=== PUP Student Portal Menu ===");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Tuition Status & Payment");
        System.out.println("4. Exit");
        System.out.println("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        //Process choice using switch statement
        switch (choice) {
            case 1:
                System.out.println("You Selected Option 1: View Grades");
                break;
            case 2:
                System.out.println("You Selected Option 2: Enroll Subjects");
                break;
            case 3:
                System.out.println("You Selected Option 3: Tuition Status & Payment");
                break;
            case 4:
                System.out.println("You Selected Option 4: Exit");
                break;
            default:
                System.out.println("Invalid Choice. Please choose from these options.");
                break;
        }
        scanner.close();
    }
}
