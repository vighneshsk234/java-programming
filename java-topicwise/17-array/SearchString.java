import java.util.Scanner;

public class SearchString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] fruits = {
            "Apple",
            "Banana",
            "Mango",
            "Orange",
            "Grapes",
            "Pineapple",
            "Watermelon"
        };

        System.out.println("Available Fruits:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.print("\n\nEnter the fruit to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i].equalsIgnoreCase(search)) {
                System.out.println(search + " found at index " + i);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println(search + " is not present in the array.");
        }

        sc.close();
    }
}