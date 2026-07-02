import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    static String[] symbols = {
            "🍒", "🍋", "🍉", "⭐", "🔔", "7️⃣"
    };

    static String spin() {
        return symbols[random.nextInt(symbols.length)];
    }

    static void displaySlot(String s1, String s2, String s3) {
        System.out.println("\n+-------------------+");
        System.out.println("|  " + s1 + " | " + s2 + " | " + s3 + "  |");
        System.out.println("+-------------------+");
    }

    static int calculatePrize(String s1, String s2, String s3, int bet) {

        if (s1.equals(s2) && s2.equals(s3)) {
            return bet * 10;      // Jackpot
        }
        else if (s1.equals(s2) || s2.equals(s3) || s1.equals(s3)) {
            return bet * 2;       // Two symbols match
        }

        return 0;                 // No match
    }

    public static void main(String[] args) {

        System.out.println("===== SLOT MACHINE =====");

        System.out.print("Enter your bet amount: ₹");
        int bet = sc.nextInt();

        String slot1 = spin();
        String slot2 = spin();
        String slot3 = spin();

        displaySlot(slot1, slot2, slot3);

        int prize = calculatePrize(slot1, slot2, slot3, bet);

        if (prize > 0) {
            System.out.println("\nCongratulations!");
            System.out.println("You won ₹" + prize);
        } else {
            System.out.println("\nNo match!");
            System.out.println("Better luck next time.");
        }

        sc.close();
    }
}