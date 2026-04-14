import java.util.Scanner;

public class EmailParser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        // Find position of '@'
        int atIndex = email.indexOf('@');

        // Extract username and domain
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // Output
        System.out.println("\nUsername: " + username);
        System.out.println("Domain: " + domain);

        sc.close();
    }
}