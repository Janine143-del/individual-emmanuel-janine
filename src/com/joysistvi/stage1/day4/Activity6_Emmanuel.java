package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity6_Emmanuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Correct credentials
        String correctUsername = "JANINE";
        String correctPassword = "123nasankana";

        int maxAttempts = 3;
        int attempts = 0;
        boolean isLoggedIn = false;

        System.out.println("=== SYSTEM LOGIN ===");

        while (attempts < maxAttempts) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Determine whether username and password are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\n[SUCCESS] Login successful! Welcome to the system.");
                isLoggedIn = true;
                break; // Exits the loop immediately on success
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;

                if (remaining > 0) {
                    System.out.println("[FAILED] Invalid username or password. Remaining attempt(s): " + remaining + "\n");
                }
            }
        }

        // Triggered if the user runs out of attempts
        if (!isLoggedIn) {
            System.out.println("\n[LOCKED] Maximum login attempts reached. Your account has been locked.");
        }

        scanner.close();
    }
}