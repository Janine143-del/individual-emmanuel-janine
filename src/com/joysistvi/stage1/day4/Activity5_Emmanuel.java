import java.util.Scanner;

public class Activity5_Emmanuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Required variables
        double balance = 5000.00;
        int choice;
        double depositAmount;
        double withdrawAmount;

        // Display Menu
        System.out.println("=== Simple JB ATM Menu ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        // Switch Statement with Nested If Validation
        switch (choice) {
            case 1:
                System.out.printf("Your current balance is: PHP %.2f%n", balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                depositAmount = sc.nextDouble();

                // Nested if validation for deposit
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.printf("Deposit successful! New balance: PHP %.2f%n", balance);
                } else {
                    System.out.println("Error: Deposit amount must be greater than zero.");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                withdrawAmount = sc.nextDouble();

                // Nested if validation for withdrawal
                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("Withdrawal successful! Remaining balance: PHP %.2f%n", balance);
                    } else {
                        System.out.println("Error: Insufficient balance.");
                    }
                } else {
                    System.out.println("Error: Withdrawal amount must be greater than zero.");
                }
                break;

            case 4:
                System.out.println("Thank you for using JB ATM, Have nice day!");
                break;

            default:
                System.out.println("Error: Invalid choice! Please select an option between 1 and 4.");
                break;
        }

        sc.close();
    }
}