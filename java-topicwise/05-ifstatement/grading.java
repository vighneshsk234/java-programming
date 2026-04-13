import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        System.out.print("Please enter your score: ");
        score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("You have got A grade.");
        } else if (score >= 75) {
            System.out.println("You have got B grade.");
        } else if (score >= 60) {
            System.out.println("You have got C grade.");
        } else if (score >= 40) {
            System.out.println("You have got D grade.");
        } else {
            System.out.println("You have failed the exam.");
        }

        scanner.close();
    }
    
}