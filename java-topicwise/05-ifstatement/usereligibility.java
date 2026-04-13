import java.util.Scanner;

public class usereligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else{
            System.out.println("Hello, " + name + "!");
        }

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
    
}