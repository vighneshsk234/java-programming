import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        sc.close();
    }
}