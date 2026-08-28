package com.joysistvi.stage1.day4;

public class Activity7_MultiNestedLoop_Emmanuel {
    public static void main(String[] args) {
    // Outer loop from 1 to 10
    for (int i = 1; i <= 10; i++) {
        System.out.println("Multiplication Table of " + i);

        // Inner loop from 1 to 10
        for (int j = 1; j <= 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));
        }

        // Line break between each table
        System.out.println();
    }
  }
}
