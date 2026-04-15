import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Weight Converter");
        System.out.println("1. Convert KG to Pounds");
        System.out.println("2. Convert Pounds to KG");

        System.out.print("Choose option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in KG: ");
            double kg = sc.nextDouble();

            double pounds = kg * 2.20462;

            System.out.println("Weight in Pounds: " + pounds);

        } else if (choice == 2) {
            System.out.print("Enter weight in Pounds: ");
            double pounds = sc.nextDouble();

            double kg = pounds / 2.20462;

            System.out.println("Weight in KG: " + kg);

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}