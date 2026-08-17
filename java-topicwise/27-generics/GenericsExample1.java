import java.util.ArrayList;

public class GenericsExample1 {

    public static void main(String[] args) {

        // Generic ArrayList of Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers:");

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        // Generic ArrayList of String
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Fruits:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}