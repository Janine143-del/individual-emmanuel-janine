package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class MathMethods_Emmanuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] methods = {
                "Math.abs()", "Math.max()", "Math.min()", "Math.pow()",
                "Math.sqrt()", "Math.round()", "Math.ceil()", "Math.floor()",
                "Math.random()", "Math.log()", "Math.log10()", "Math.exp()",
                "Math.sin()", "Math.cos()", "Math.tan()"
        };

        String[] returnTypes = {
                "int/double", "int/double", "int/double", "double",
                "double", "long/int", "double", "double",
                "double", "double", "double", "double",
                "double", "double", "double"
        };

        String[] syntax = {
                "Math.abs(num)",
                "Math.max(a, b)",
                "Math.min(a, b)",
                "Math.pow(base, exp)",
                "Math.sqrt(num)",
                "Math.round(num)",
                "Math.ceil(num)",
                "Math.floor(num)",
                "Math.random()",
                "Math.log(num)",
                "Math.log10(num)",
                "Math.exp(num)",
                "Math.sin(rad)",
                "Math.cos(rad)",
                "Math.tan(rad)"
        };

        String[] descriptions = {
                "It returns the absolute value of a number, stripping any negative sign.",
                "This compares two arguments and returns the greater value.",
                "This compares two arguments and returns the smaller value.",
                "It calculate the value of a base raised to the power of an exponent (a^b).",
                "This calculate the positive square root of a non-negative number.",
                "Rounds a floating-point value to the closest whole integer.",
                "Rounds a decimal number upward to the nearest integer value.",
                "Rounds a decimal number downward to the nearest integer value.",
                "Generates a pseudorandom decimal in the range like this [0.0, 1.0).",
                "Calculates the natural logarithm (base e) of a given value.",
                "Calculates the base-10 common logarithm of a value.",
                "It returns Euler's number e raised to the power of the argument (e^x).",
                "It returns the trigonometric sine of an angle expressed in radians.",
                "It returns the trigonometric cosine of an angle expressed in radians.",
                "It returns the trigonometric tangent of an angle expressed in radians."
        };

        String[] examples = {
                "Math.abs(-25) -> 25",
                "Math.max(14, 42) -> 42",
                "Math.min(14, 42) -> 14",
                "Math.pow(2, 3) -> 8.0",
                "Math.sqrt(81) -> 9.0",
                "Math.round(5.6) -> 6",
                "Math.ceil(7.2) -> 8.0",
                "Math.floor(7.8) -> 7.0",
                "Math.random() -> 0.4582",
                "Math.log(Math.E) -> 1.0",
                "Math.log10(100) -> 2.0",
                "Math.exp(1) -> 2.7182",
                "Math.sin(Math.PI/2) -> 1.0",
                "Math.cos(0) -> 1.0",
                "Math.tan(Math.PI/4) -> 1.0"
        };

        // Print the entire summary table
        System.out.println("=======================================================================================================================================================");
        System.out.println("                                                               JAVA MATH METHODS REPORT                                                                ");
        System.out.println("=======================================================================================================================================================");
        System.out.printf("%-5s %-16s %-13s %-24s %-28s %-75s%n", "No.", "Method Name", "Return Type", "Syntax", "Code Example", "Description");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < methods.length; i++) {
            System.out.printf("%-5d %-16s %-13s %-24s %-28s %-75s%n", (i + 1), methods[i], returnTypes[i], syntax[i], examples[i], descriptions[i]);
        }
        System.out.println("=======================================================================================================================================================\n");

        // Use Scanner to inspect a single method (presentation style)
        System.out.print("Enter method number to view details (1-15): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 15) {
            int idx = choice - 1;
            System.out.println("\n--- METHOD DETAILS ---");
            System.out.println("Method:      " + methods[idx]);
            System.out.println("Return Type: " + returnTypes[idx]);
            System.out.println("Syntax:      " + syntax[idx]);
            System.out.println("Example:     " + examples[idx]);
            System.out.println("Description: " + descriptions[idx]);
        } else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}