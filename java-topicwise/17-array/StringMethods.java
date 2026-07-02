public class StringMethods {

    public static void main(String[] args) {

        String name = "  Vighnesh SK  ";
        String text = "Java Programming";

        // length()
        System.out.println("Length: " + text.length());

        // charAt()
        System.out.println("Character at index 5: " + text.charAt(5));

        // indexOf()
        System.out.println("Index of 'P': " + text.indexOf('P'));

        // lastIndexOf()
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));

        // toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase());

        // trim()
        System.out.println("Trim: '" + name.trim() + "'");

        // replace()
        System.out.println("Replace: " + text.replace("Java", "Python"));

        // substring()
        System.out.println("Substring: " + text.substring(5));
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // contains()
        System.out.println("Contains 'Program': " + text.contains("Program"));

        // startsWith()
        System.out.println("Starts with 'Java': " + text.startsWith("Java"));

        // endsWith()
        System.out.println("Ends with 'ing': " + text.endsWith("ing"));

        // equals()
        System.out.println("Equals: " + text.equals("Java Programming"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + text.equalsIgnoreCase("java programming"));

        // isEmpty()
        String s1 = "";
        System.out.println("Is Empty: " + s1.isEmpty());

        // isBlank()
        String s2 = "   ";
        System.out.println("Is Blank: " + s2.isBlank());

        // concat()
        System.out.println("Concat: " + text.concat(" Language"));

        // repeat()
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // compareTo()
        System.out.println("CompareTo: " + "Apple".compareTo("Banana"));

        // split()
        String[] words = text.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // toCharArray()
        char[] chars = text.toCharArray();
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        // valueOf()
        int number = 100;
        String strNumber = String.valueOf(number);
        System.out.println("ValueOf: " + strNumber);

    }
}