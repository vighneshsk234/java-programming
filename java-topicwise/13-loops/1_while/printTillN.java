import java.util.Scanner;

public class printTillN {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int n;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}