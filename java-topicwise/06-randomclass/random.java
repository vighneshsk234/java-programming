import java.util.Random;

public class random {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomIntRange = random.nextInt(100); // This will generate a random integer from 0 to 99
        // random.nextInt(1,101) It can be written as this also, but it is only available in Java 17 and later versions.
        System.out.println("Random Integer (0-99): " + randomIntRange);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean value
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);
    }   
}
