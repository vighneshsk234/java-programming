import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("===== ROCK PAPER SCISSORS =====");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("\nEnter your choice (1-3): ");
        int userChoice = sc.nextInt();

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("\nYou chose: " + choices[userChoice - 1]);
        System.out.println("Computer chose: " + choices[computerChoice - 1]);

        if (userChoice == computerChoice) {
            System.out.println("\nIt's a Draw!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("\nYou Win!");
        }
        else {
            System.out.println("\nComputer Wins!");
        }

        sc.close();
    }
}