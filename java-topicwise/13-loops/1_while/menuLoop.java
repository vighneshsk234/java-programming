import java.util.Scanner;

public class menuLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Bye!");
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}