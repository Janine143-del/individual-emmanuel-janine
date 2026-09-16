package com.joysistvi.stage3.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class Act16_Emmanuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=-=- Todo Manager Menu -=-=");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty.");
                    } else {
                        System.out.println("\n====== Current Tasks ======");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to update.");
                    } else {
                        System.out.print("Enter task number to update (1 to " + tasks.size() + "): ");
                        int updateIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consume newline

                        if (updateIndex >= 0 && updateIndex < tasks.size()) {
                            System.out.print("Enter new task description: ");
                            String updatedText = scanner.nextLine();
                            tasks.set(updateIndex, updatedText);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter task number to remove (1 to " + tasks.size() + "): ");
                        int removeIndex = scanner.nextInt() - 1;
                        scanner.nextLine(); // Consume newline

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            String removedTask = tasks.remove(removeIndex);
                            System.out.println("Removed: \"" + removedTask + "\"");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks cleared!");
                    break;

                case 0:
                    System.out.println("Exiting TodoManager. Have nice day and see you again for another tasks!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose from 0 to 5.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
