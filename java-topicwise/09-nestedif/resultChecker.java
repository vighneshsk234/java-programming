import java.util.Scanner;

public class resultChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Nested if
        if (marks >= 35) {
            if (marks >= 75) {
                System.out.println("Result: Pass");
                System.out.println("Grade: Distinction");
            } else if (marks >= 60) {
                System.out.println("Result: Pass");
                System.out.println("Grade: First Class");
            } else if (marks >= 50) {
                System.out.println("Result: Pass");
                System.out.println("Grade: Second Class");
            } else {
                System.out.println("Result: Pass");
                System.out.println("Grade: Pass Class");
            }
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}