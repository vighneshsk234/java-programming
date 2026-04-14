import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Ternary Operator
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is: " + result);

        sc.close();
    }
}