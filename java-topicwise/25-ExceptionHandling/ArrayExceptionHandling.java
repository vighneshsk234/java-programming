import java.util.Scanner;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {

            System.out.print("Enter the index (0-4): ");
            int index = scanner.nextInt();

            System.out.println("Element = " + numbers[index]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        catch (Exception e) {
            System.out.println("Invalid input.");
        }
        finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }
}