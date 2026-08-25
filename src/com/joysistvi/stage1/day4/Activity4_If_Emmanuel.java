package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity4_If_Emmanuel {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Display the Game Menu
        System.out.println("=== GAME MENU ===");
        System.out.println("1. START NOW! ");
        System.out.println("2. Load Game ");
        System.out.println("3. Settings ");
        System.out.println("4. Exit:( ");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        //Process choice using if-else if ladder
        if (choice == 1) {
            System.out.println("You selected Option 1: START NOW! ");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game ");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings ");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit:( ");
        } else {
            System.out.println("Invalid Choice. Please choose from these options.");
        }

        scanner.close();
    }
}
