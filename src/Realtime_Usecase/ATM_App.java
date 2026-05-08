package Realtime_Usecase;

import java.util.Scanner;

// ATMAccount class represents a single bank account
class ATMAccount {

    // =====================================
    // Encapsulated Variables
    // =====================================

    // balance and pin are private
    // so external classes cannot access them directly
    private double balance;
    private int pin;

    // =====================================
    // Constructor
    // =====================================

    // Constructor initializes object values
    public ATMAccount(double balance, int pin) {

        // Validate initial balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }

        // Initialize PIN
        this.pin = pin;
    }

    // =====================================
    // Internal PIN Validation Method
    // =====================================

    // This method validates whether entered PIN is correct
    // private means it can only be used inside this class
    private boolean validatePin(int enteredPin) {

        System.out.println("Validating PIN...");

        return this.pin == enteredPin;
    }

    // =====================================
    // Deposit Method
    // =====================================

    // Used to deposit amount into account
    public void deposit(double amount) {

        // Deposit amount should be positive
        if (amount > 0) {

            balance += amount;

            System.out.println("₹" + amount + " Deposited Successfully");

        } else {

            System.out.println("Invalid Deposit Amount");
        }
    }

    // =====================================
    // Withdraw Method
    // =====================================

    // Used to withdraw money from account
    public void withdraw(double amount, int enteredPin) {

        // Step 1: Validate PIN
        if (!validatePin(enteredPin)) {

            System.out.println("Wrong PIN");
            return;
        }

        // Step 2: Check balance
        if (amount > balance) {

            System.out.println("Insufficient Balance");
            return;
        }

        // Step 3: Withdraw amount
        if (amount > 0) {

            balance -= amount;

            System.out.println("₹" + amount + " Withdrawn Successfully");

        } else {

            System.out.println("Invalid Withdrawal Amount");
        }
    }

    // =====================================
    // Check Balance Method
    // =====================================

    // Used to display account balance
    public void checkBalance(int enteredPin) {

        // Validate PIN before showing balance
        if (validatePin(enteredPin)) {

            System.out.println("Available Balance: ₹" + balance);

        } else {

            System.out.println("Wrong PIN");
        }
    }
}

// =====================================
// Main Class
// =====================================

public class ATM_App {

    public static void main(String[] args) {

        // Scanner object used to get user input
        Scanner sc = new Scanner(System.in);

        // =====================================
        // Create ATM Account Object
        // =====================================

        ATMAccount user1 = new ATMAccount(10000, 1234);

        // Variable used to continue ATM operations
        boolean continueATM = true;

        System.out.println("====== WELCOME TO ATM ======");

        // =====================================
        // Loop continues until user exits
        // =====================================

        while (continueATM) {

            // Display menu options
            System.out.println("\nChoose an Option");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            // Get user choice
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            // =====================================
            // Execute selected option
            // =====================================

            switch (choice) {

                // --------------------------------
                // Deposit Option
                // --------------------------------

                case 1:

                    System.out.print("Enter Deposit Amount: ");

                    double depositAmount = sc.nextDouble();

                    user1.deposit(depositAmount);

                    break;

                // --------------------------------
                // Withdraw Option
                // --------------------------------

                case 2:

                    System.out.print("Enter Withdrawal Amount: ");

                    double withdrawAmount = sc.nextDouble();

                    System.out.print("Enter PIN: ");

                    int withdrawPin = sc.nextInt();

                    user1.withdraw(withdrawAmount, withdrawPin);

                    break;

                // --------------------------------
                // Check Balance Option
                // --------------------------------

                case 3:

                    System.out.print("Enter PIN: ");

                    int balancePin = sc.nextInt();

                    user1.checkBalance(balancePin);

                    break;

                // --------------------------------
                // Exit Option
                // --------------------------------

                case 4:

                    System.out.println("Thank You For Using ATM");

                    // Stop loop
                    continueATM = false;

                    break;

                // --------------------------------
                // Invalid Option
                // --------------------------------

                default:

                    System.out.println("Invalid Choice");
            }
        }

        // Close scanner resource
        sc.close();
    }
}