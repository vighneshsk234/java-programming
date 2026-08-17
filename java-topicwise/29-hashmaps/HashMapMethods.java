import java.util.HashMap;

public class HashMapMethods {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        // put() - Add key-value pairs
        students.put("Vighnesh", 90);
        students.put("Rahul", 85);
        students.put("Priya", 95);
        students.put("Amit", 80);

        System.out.println("HashMap: " + students);

        // get() - Get value using key
        System.out.println("Vighnesh's Marks: " + students.get("Vighnesh"));

        // getOrDefault() - Get value or default value
        System.out.println("Rohan's Marks: "
                + students.getOrDefault("Rohan", 0));

        // containsKey() - Check if key exists
        System.out.println("Contains Rahul? "
                + students.containsKey("Rahul"));

        // containsValue() - Check if value exists
        System.out.println("Contains 95? "
                + students.containsValue(95));

        // replace() - Replace value
        students.replace("Rahul", 88);
        System.out.println("After replace(): " + students);

        // putIfAbsent() - Add only if key does not exist
        students.putIfAbsent("Amit", 100);
        students.putIfAbsent("Rohan", 75);
        System.out.println("After putIfAbsent(): " + students);

        // remove() - Remove using key
        students.remove("Priya");
        System.out.println("After remove(): " + students);

        // size() - Number of key-value pairs
        System.out.println("Size: " + students.size());

        // isEmpty() - Check whether HashMap is empty
        System.out.println("Is Empty? " + students.isEmpty());

        // keySet() - Get all keys
        System.out.println("Keys: " + students.keySet());

        // values() - Get all values
        System.out.println("Values: " + students.values());

        // entrySet() - Get key-value pairs
        System.out.println("Entries: " + students.entrySet());

        // Enhanced for loop using entrySet()
        System.out.println("\nStudent Details:");

        for (HashMap.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // clear() - Remove everything
        students.clear();

        System.out.println("\nAfter clear(): " + students);
        System.out.println("Is Empty? " + students.isEmpty());
    }
}