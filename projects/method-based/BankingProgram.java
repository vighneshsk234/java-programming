import java.util.Scanner;

public class BankingProgram {

    static double balance = 1000.0;
    static Scanner sc = new Scanner(System.in);

    static void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    static void deposit() {
        System.out.print("Enter deposit amount: ₹");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    static void exitProgram() {
        System.out.println("Thank you for using the Banking Program.");
    }

    static void displayMenu() {
        System.out.println("\n===== BANKING PROGRAM =====");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    exitProgram();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}