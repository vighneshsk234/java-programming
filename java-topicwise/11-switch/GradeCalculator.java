import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        String grade = switch (marks / 10) {
            case 10, 9 -> "Grade A";
            case 8 -> "Grade B";
            case 7 -> "Grade C";
            case 6 -> "Grade D";
            case 5 -> "Grade E";
            default -> (marks >= 0 && marks < 50) ? "Fail" : "Invalid Input";
        };

        System.out.println("Result: " + grade);

        sc.close();
    }
}