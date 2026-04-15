import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);

        // Ternary Operator
        double result = (choice == 'C' || choice == 'c') 
                        ? (temp - 32) * 5 / 9 
                        : (temp * 9 / 5) + 32;

        String output = (choice == 'C' || choice == 'c') 
                        ? "Temperature in Celsius: " 
                        : "Temperature in Fahrenheit: ";

        System.out.println(output + result);

        sc.close();
    }
}   