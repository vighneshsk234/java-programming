import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = "";

        while (!password.equals("java123")) {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        }

        System.out.println("Access Granted!");
        sc.close();
    }
}