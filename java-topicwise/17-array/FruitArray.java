public class FruitArray {

    public static void main(String[] args) {

        // Creating and initializing an array
        String[] fruits = {
            "Apple",
            "Banana",
            "Mango",
            "Orange",
            "Grapes"
        };

        // Display the entire array
        System.out.println("Original Array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + " -> " + fruits[i]);
        }

        // Length of the array
        System.out.println("\nLength of the array = " + fruits.length);

        // Accessing elements using index
        System.out.println("\nFruit at index 0 = " + fruits[0]);
        System.out.println("Fruit at index 2 = " + fruits[2]);
        System.out.println("Fruit at index 4 = " + fruits[4]);

        // Changing the value at a particular index
        fruits[1] = "Pineapple";
        fruits[3] = "Watermelon";

        System.out.println("\nArray after updating elements:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + " -> " + fruits[i]);
        }

        // Assigning a new value directly
        fruits[4] = "Strawberry";

        System.out.println("\nAfter changing index 4:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + " -> " + fruits[i]);
        }

    }
}