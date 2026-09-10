package com.joysistvi.stage1.day4;

import java.util.Scanner;

public class UserAccount_Emmanuel {
    // Private fields
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // Constructor
    public UserAccount_Emmanuel(String firstName, String middleName, String lastName, String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        setEmail(email);
        setPassword(password);
    }

    // Validation Methods
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }

    // Getter methods (Accessor methods)
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setter methods / Mutator methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "Invalid Email";
        }
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            this.password = "Invalid Password";
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("===================================");
        System.out.println("|     User Account Registration   |");
        System.out.println("===================================");
        System.out.println();

        // User Input prompts
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Instantiate object using UserAccount_Emmanuel
        UserAccount_Emmanuel user = new UserAccount_Emmanuel(firstName, middleName, lastName, address, email, password);

        // Display results
        System.out.println();
        System.out.println("--- User Account Created ---");
        System.out.println("Full Name: " + user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        scanner.close();
    }
}