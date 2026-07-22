import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Accessing an element
        System.out.println("First Fruit: " + fruits.get(0));

        // Updating an element
        fruits.set(1, "Grapes");
        System.out.println("After Update: " + fruits);

        // Removing an element
        fruits.remove("Mango");
        System.out.println("After Removing Mango: " + fruits);

        // Size of ArrayList
        System.out.println("Size: " + fruits.size());

        // Checking if an element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Loop through ArrayList
        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("\nAfter Clear: " + fruits);

        // Checking if ArrayList is empty
        System.out.println("Is Empty? " + fruits.isEmpty());
    }
}