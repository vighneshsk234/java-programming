import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<String, Integer> students = new HashMap<>();

        // Adding key-value pairs
        students.put("Vighnesh", 90);
        students.put("Rahul", 85);
        students.put("Priya", 95);
        students.put("Amit", 80);

        System.out.println("Students: " + students);

        // Accessing a value using key
        System.out.println("Vighnesh's Marks: " + students.get("Vighnesh"));

        // Updating a value
        students.put("Rahul", 92);

        System.out.println("After Updating Rahul: " + students);

        // Checking if a key exists
        System.out.println("Has Priya? " + students.containsKey("Priya"));

        // Checking if a value exists
        System.out.println("Has marks 80? " + students.containsValue(80));

        // Removing a key-value pair
        students.remove("Amit");

        System.out.println("After Removing Amit: " + students);

        // Size
        System.out.println("Number of Students: " + students.size());

        // Displaying keys and values using enhanced for loop
        System.out.println("\nStudent Details:");

        for (String name : students.keySet()) {
            System.out.println(name + " -> " + students.get(name));
        }
    }
}