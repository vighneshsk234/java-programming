import java.util.Scanner;

public class validationForEmail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        // Find position of '@'
        int atIndex = email.indexOf('@');
        
        if (atIndex == -1) {
            System.out.println("Invalid email format. Please enter a valid email address.");
            
        } else {
            // Extract username and domain
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            
            // Output
            System.out.println("\nUsername: " + username);
            System.out.println("Domain: " + domain);
        }

        
        sc.close();
    }
}