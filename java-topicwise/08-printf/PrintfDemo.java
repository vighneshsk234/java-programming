public class PrintfDemo {
    public static void main(String[] args) {

        String name = "Vighnesh";
        int age = 21;
        double height = 5.87654;

        // Basic printing
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);

        // Floating point formatting
        System.out.printf("Height: %.2f\n", height);

        // Multiple values in one line
        System.out.printf("Name: %s, Age: %d, Height: %.2f\n", name, age, height);

        // Width and alignment
        System.out.printf("Right aligned number: %10d\n", age);
        System.out.printf("Left aligned number: %-10d\n", age);

        // Zero padding
        System.out.printf("Zero padded number: %05d\n", age);

        // Floating precision
        System.out.printf("Value up to 3 decimal: %.3f\n", height);
    }
}