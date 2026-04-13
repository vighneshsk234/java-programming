import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter side A: ");
        double a = sc.nextDouble();

        System.out.print("Enter side B: ");
        double b = sc.nextDouble();

        // Calculating hypotenuse
        double hypotenuse = Math.sqrt((a * a) + (b * b));

        // Output
        System.out.println("Hypotenuse: " + hypotenuse);

        sc.close();
    }
}