package com.joysistvi.stage1.day4;

public class Activity3_Emmanuel {
    public static void main(String[] args) {
        //--- Task 2: Event Entry Checker ---
        int age = 18;
        boolean hasValidID = true;
        String JRequirement = ( age >= 18 && hasValidID) ? "Yes" : "No";

        System.out.println("--- Task 2: Event Entry Checker ---");
        System.out.println("Allowed to enter the Event: " + JRequirement);
        System.out.println();

        //--- Task 3: Class Status Check ---
        boolean isWeekend = true;
        boolean isHoliday = false;
        String ClassStat = (isWeekend || isHoliday) ? "Yes, no clasess" : "No, there are classes.";

        System.out.println("--- Task 3: Class Status Checker ---");
        System.out.println("Are there no classes today ?" + ClassStat);
        System.out.println();

        //--- Task 4: Passed or Failed Checker ---
        int score = 85;
        String GradeRemark = (score >= 75) ? "Passed" : "Failed";

        System.out.println("--- Task 4: Passed or Failed Checker ---");
        System.out.println("Score: "+ score);
        System.out.println("GradeRemark: " + GradeRemark);
        System.out.println();

        //--- Task 5: Larger Number Checker ---
        int num = 10;
        int num2 = 25;
        int larger = (num > num2) ? num : num2;

        System.out.println("--- Task 5: Larger Number Checker ---");
        System.out.println("Number 1: "+ num + ", Number 2: " + num2);
        System.out.println("The larger number is: " + larger);
    }
}
