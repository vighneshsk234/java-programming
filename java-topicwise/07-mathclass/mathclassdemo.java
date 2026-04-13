public class mathclassdemo {
    public static void main(String[] args) {

        // Constants
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of E: " + Math.E);

        // Power
        System.out.println("\nPower (2^3): " + Math.pow(2, 3));

        // Absolute value
        System.out.println("Absolute value of -10: " + Math.abs(-10));

        // Square root
        System.out.println("Square root of 25: " + Math.sqrt(25));

        // Rounding
        System.out.println("\nRound 5.6: " + Math.round(5.6));
        System.out.println("Round 5.4: " + Math.round(5.4));

        // Ceil and Floor
        System.out.println("\nCeil of 5.1: " + Math.ceil(5.1));
        System.out.println("Floor of 5.9: " + Math.floor(5.9));

        // Maximum and Minimum
        System.out.println("\nMax of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
    }
}