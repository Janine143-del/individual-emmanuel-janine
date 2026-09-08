package com.joysistvi.stage1.day4;

import java.util.Random;

public class Activity12_Emmanuel {

    // A method to identify if a number is odd or even
    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // A method to print your name 50 times
    public static void printNameFiftyTimes(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "." + name);
        }
    }

    // A method to get the square root of a certain variable
    public static void printSquareRoot(double number) {
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
    }

    // A method to get the power of a number using base and exponent
    public static void printPower(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " is: " + result);
    }

    // A method to print a random number between 1 and 100
    public static void printRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random number (1-100): " + randomNumber);
    }

    // A method to get the area of a circle using the given radius
    public static void printAreaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    // A method to identify if a person is a voter or not
    public static void checkVoterStatus(int age) {
        if (age >= 18) {
            System.out.println("A person aged " + age + " is a VOTER.");
        } else {
            System.out.println("A person aged " + age + " is NOT a voter.");
        }
    }

    // A method to get the length of a certain word
    public static void printWordLength(String word) {
        int length = word.length();
        System.out.println("The length of the word '" + word + "' is: " + length);
    }

    // A method to print a certain word in reverse order
    public static void printWordReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("Reversed word of '" + word + "' is: " + reversed);
    }

    // A method to print your full name and age
    public static void printNameAndAge(String fullName, int age) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        checkOddOrEven(7);
        printNameFiftyTimes("Janine Beatriz Emmanuel");
        printSquareRoot(81);
        printPower(2, 5);
        printRandomNumber();
        printAreaOfCircle(5);
        checkVoterStatus(18);
        printWordLength("Philippines");
        printWordReverse("Computer");
        printNameAndAge("Janine Beatriz Emmanuel", 19);
    }
}
