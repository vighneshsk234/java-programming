import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);
        sc.close();
    }
}