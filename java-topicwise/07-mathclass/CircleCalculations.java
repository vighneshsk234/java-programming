import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Calculations
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        double volume = (4.0 / 3.0) * Math.PI * r * r * r; // sphere volume

        // Output
        System.out.println("\nArea of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
        System.out.println("Volume of Sphere: " + volume);

        sc.close();
    }
}