package com.joysistvi.stage1.day4;

public class NestForLoop {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int x = 1; x <= i; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}