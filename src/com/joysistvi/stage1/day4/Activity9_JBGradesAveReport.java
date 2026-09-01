package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class Activity9_JBGradesAveReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("==============================================");
        System.out.println("             Average Calculator               ");
        System.out.println("==============================================");

        // Number of students and subjects
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // 1D Array for subject names
        String[] subjects = new String[numSubjects];
        System.out.println("\nEnter subject names:");
        for (int j = 0; j < subjects.length; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjects[j] = scanner.nextLine();
        }

        // 1D and 2D Arrays for students and grades
        String[] studentNames = new String[numStudents];
        int[][] grades = new int[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        // [Section] Multi-dimensional array using Scanner
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter grades for each subject:");
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextInt();
                sum += grades[i][j];
            }
            scanner.nextLine(); // Consume newline after numeric input

            averages[i] = (double) sum / numSubjects;
        }

        // [Section] Output Grades Report Table
        System.out.println("\n==============================================");
        System.out.println("               Grades Report                  ");
        System.out.println("==============================================");

        // Table Header
        System.out.printf("%-16s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-10s", subject);
        }
        System.out.println("Average");

        System.out.println("--------------------------------------------------");

        // Table Rows using nested iteration
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-16s", studentNames[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("%-10d", grades[i][j]);
            }
            System.out.printf("%.2f%n", averages[i]);
        }

        scanner.close();
    }
}
