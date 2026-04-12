import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter an animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a verb (ending with -ing): ");
        String verb = sc.nextLine();

        System.out.print("Enter a food item: ");
        String food = sc.nextLine();

        // Creating Mad Lib story
        System.out.println("\n Your Mad Lib Story \n");

        System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("There, they saw a very " + adjective + " " + animal + ".");
        System.out.println("The " + animal + " was busy " + verb + ".");
        System.out.println("Suddenly, it started eating " + food + "!");
        System.out.println(name + " couldn't believe their eyes and started laughing!");

        sc.close();
    }
}