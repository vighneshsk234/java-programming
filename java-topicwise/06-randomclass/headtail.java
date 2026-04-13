import java.util.Random;   

public class headtail {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Simulate a coin flip (0 for heads, 1 for tails)
        boolean isHead = random.nextBoolean(); // This will generate either true (heads) or false (tails)

        if (isHead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
