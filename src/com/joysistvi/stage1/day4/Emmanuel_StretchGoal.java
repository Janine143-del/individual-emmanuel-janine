package com.joysistvi.stage1.day4;

public class Emmanuel_StretchGoal {
    public static void main(String[] args) {
        String country = "Philippines";

        // 1. First at Last character
        char firstChar = country.charAt(0);
        char lastChar = country.charAt(country.length() - 1);

        int pCount = 0;
        int vowelCount = 0;

        // 2 & 3. Standard for loop used length() and charAt()
        for (int i = 0; i < country.length(); i++) {
            char ch = country.charAt(i);

            // Number of P or p
            if (ch == 'P' || ch == 'p') {
                pCount++;
            }

            // Number of Vowels
               if  (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }

        // Output
        System.out.println("String: " + country);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);
        System.out.println("Total P/p: " + pCount);
        System.out.println("Total Vowels: " + vowelCount);
    }
}
