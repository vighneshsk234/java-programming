import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    static Random random = new Random();

    static int rollDie() {
        return random.nextInt(6) + 1;
    }

    static void printDie(int die) {

        switch (die) {

            case 1:
                System.out.println("""
                     ┌─────┐
                     │     │
                     │  ●  │
                     │     │
                     └─────┘
                     """);
                break;

            case 2:
                System.out.println("""
                     ┌─────┐
                     │ ●   │
                     │     │
                     │   ● │
                     └─────┘
                     """);
                break;

            case 3:
                System.out.println("""
                     ┌─────┐
                     │ ●   │
                     │  ●  │
                     │   ● │
                     └─────┘
                     """);
                break;

            case 4:
                System.out.println("""
                     ┌─────┐
                     │ ● ● │
                     │     │
                     │ ● ● │
                     └─────┘
                     """);
                break;

            case 5:
                System.out.println("""
                     ┌─────┐
                     │ ● ● │
                     │  ●  │
                     │ ● ● │
                     └─────┘
                     """);
                break;

            case 6:
                System.out.println("""
                     ┌─────┐
                     │ ● ● │
                     │ ● ● │
                     │ ● ● │
                     └─────┘
                     """);
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many times do you want to roll the die? ");
        int rolls = sc.nextInt();

        int total = 0;

        System.out.println("\nRolling Dice...\n");

        for (int i = 1; i <= rolls; i++) {

            int die = rollDie();

            System.out.println("Roll #" + i + ": " + die);
            printDie(die);

            total += die;
        }

        System.out.println("Total of all dice values = " + total);

        sc.close();
    }
}