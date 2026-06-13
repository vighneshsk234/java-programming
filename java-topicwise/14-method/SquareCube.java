import java.util.Scanner;

public class SquareCube {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square = " + square(num));
        System.out.println("Cube = " + cube(num));

        sc.close();
    }
}