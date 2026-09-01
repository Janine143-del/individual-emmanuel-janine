package com.joysistvi.stage1.day4;

public class StringMethods_Emmanuel {
  public static void main(String[] args) {
    String[] methods = {
             "contains()", "endsWith()", "startsWith()", "indexOf()",
            "isEmpty()", "trim()", "replace()", "toCharArray()",
            "nextLine().charAt()", "valueOf()"
    };

    String[] returnTypes = {
            "boolean", "boolean", "boolean", "int",
            "boolean", "String", "String", "char[]",
            "char", "String"
    };

      String[] syntax = {
              "str.contains(seq)",
              "str.endsWith(suffix)",
              "str.startsWith(prefix)",
              "str.indexOf(target)",
              "str.isEmpty()",
              "str.trim()",
              "str.replace(old, new)",
              "str.toCharArray()",
              "sc.nextLine().charAt(idx)",
              "String.valueOf(data)"
    };

    String[] descriptions = {
            "It is a built-in function that is utilized to determine specific sequences of characters. It returns true if found and false if not.",
            "This determines if a String ends with a specified sequence.",
            "Vice versa of endsWith() that checks if a String starts with a specified sequence.",
            "It used to find the position or index of a specific character or word inside a String.",
            "This method is used to identify if a String is empty or has no characters. It returns true if the String is empty and false if it contains characters.",
            "It is used to remove extra spaces at the beginning and at the end of a string.",
            "It is a method where a specific character in a String will be replaced by another character.",
            "Converts a String into an array of characters.",
            "nextLine() reads a line of text entered by the user, while charAt() gets a specific character from that text.",
            "It is used to convert a value, such as a number or character, into a String."
    };

    System.out.println("==========================================================================================");
    System.out.println("                               JAVA STRING METHODS REPORT                                 ");
    System.out.println("==========================================================================================");
    System.out.printf("%-22s %-14s %-30s %-45s%n", "Method Name", "Return Type", "Syntax", "Description");
    System.out.println("------------------------------------------------------------------------------------------");

    for (int i = 0; i < methods.length; i++) {
        System.out.printf("%-22s %-14s %-30s %-45s%n", methods[i], returnTypes[i], syntax[i], descriptions[i]);
    }

    System.out.println("==========================================================================================");
}
}
