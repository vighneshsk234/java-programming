import java.util.Random;
import java.util.Scanner;

public class SlotMachine_1 {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    static String[] symbols = {
            "CHERRY",
            "LEMON",
            "ORANGE",
            "BELL",
            "STAR",
            "7"
    };

    static String spin() {
        return symbols[random.nextInt(symbols.length)];
    }

    static void printSlot(String s1, String s2, String s3) {

        System.out.println("\n+---------------------------------------+");
        System.out.printf("| %-8s | %-8s | %-8s |\n", s1, s2, s3);
        System.out.println("+---------------------------------------+");
    }

    static int calculatePrize(String s1, String s2, String s3, int bet) {

        // Three matching symbols
        if (s1.equals(s2) && s2.equals(s3)) {

            switch (s1) {
                case "7":
                    return bet * 20;

                case "STAR":
                    return bet * 15;

                case "BELL":
                    return bet * 10;

                case "CHERRY":
                    return bet * 8;

                case "ORANGE":
                    return bet * 6;

                case "LEMON":
                    return bet * 5;
            }
        }

        // Two matching symbols
        if (s1.equals(s2) || s2.equals(s3) || s1.equals(s3)) {
            return bet * 2;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          SLOT MACHINE GAME");
        System.out.println("========================================");

        System.out.print("Enter your bet amount: ₹");
        int bet = sc.nextInt();

        System.out.println("\nSpinning...");
        System.out.println("---------------------------");

        String slot1 = spin();
        String slot2 = spin();
        String slot3 = spin();

        printSlot(slot1, slot2, slot3);

        int prize = calculatePrize(slot1, slot2, slot3, bet);

        if (prize > 0) {

            System.out.println("\n🎉 Congratulations! 🎉");
            System.out.println("You won ₹" + prize);

        } else {

            System.out.println("\nNo matching symbols.");
            System.out.println("Better luck next time!");

        }

        sc.close();
    }
}