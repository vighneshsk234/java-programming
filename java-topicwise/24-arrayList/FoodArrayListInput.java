import java.util.ArrayList;
import java.util.Scanner;

public class FoodArrayListInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        // Ask how many food items to add
        System.out.print("How many food items do you want to add? ");
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Take user input
        for (int i = 1; i <= numberOfFoods; i++) {
            System.out.print("Enter food " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        // Display the ArrayList
        System.out.println("\nFood Items:");
        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}