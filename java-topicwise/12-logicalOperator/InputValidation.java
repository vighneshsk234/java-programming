import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 100: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 100) {
            System.out.println("Valid input.");
        } else {
            System.out.println("Invalid input! Number out of range.");
        }

        sc.close();
    }
}