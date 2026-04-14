public class StringMethodsDemo {
    public static void main(String[] args) {

        String text = "  Hello Java World  ";
        String text2 = "hello java world";

        // Length
        System.out.println("Length: " + text.length());

        // Trim (remove spaces)
        System.out.println("Trim: " + text.trim());

        // To Uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // To Lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // Equals
        System.out.println("Equals: " + text.equals(text2));

        // Equals Ignore Case
        System.out.println("Equals Ignore Case: " + text.equalsIgnoreCase(text2));

        // Contains
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // Replace
        System.out.println("Replace: " + text.replace("Java", "Python"));

        // Substring
        System.out.println("Substring (6 to 10): " + text.substring(6, 10));

        // Index Of
        System.out.println("Index of 'Java': " + text.indexOf("Java"));

        // Char At
        System.out.println("Character at index 2: " + text.charAt(2));

        // Starts With
        System.out.println("Starts with 'Hello': " + text.trim().startsWith("Hello"));

        // Ends With
        System.out.println("Ends with 'World': " + text.trim().endsWith("World"));

        // Is Empty
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());
    }
}