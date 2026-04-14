import java.util.Scanner;

public class entryChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have an ID proof? (true/false): ");
        boolean hasID = sc.nextBoolean();

        // Nested if
        if (age >= 18) {
            if (hasID) {
                System.out.println("You are allowed entry.");
            } else {
                System.out.println("You need ID proof for entry.");
            }
        } else {
            System.out.println("You are underage. Entry denied.");
        }

        sc.close();
    }
}