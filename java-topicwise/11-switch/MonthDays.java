import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        String result = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 or 29 days (Leap Year)";
            default -> "Invalid month!";
        };

        System.out.println("Result: " + result);

        sc.close();
    }
}