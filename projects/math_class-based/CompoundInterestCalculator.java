import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            // User Input
            System.out.print("Enter Principal Amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Rate of Interest (in %): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();

            System.out.print("Enter number of times interest compounded per year: ");
            int n = sc.nextInt();

            // Formula: A = P(1 + r/n)^(n*t)
            double amount = principal * Math.pow((1 + (rate / 100) / n), n * time);

            double compoundInterest = amount - principal;

            // Output
            System.out.println("\n----- RESULT -----");
            System.out.printf("Final Amount: %.2f%n", amount);
            System.out.printf("Compound Interest: %.2f%n", compoundInterest);

            // Loop control
            System.out.print("\nDo you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using the calculator!");

        sc.close();
    }
}