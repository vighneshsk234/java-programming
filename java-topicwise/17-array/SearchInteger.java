import java.util.Scanner;

public class SearchInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 25, 35, 40, 55, 65, 75, 85, 95};

        System.out.print("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nEnter the number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {
                System.out.println(search + " found at index " + i);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println(search + " is not present in the array.");
        }

        sc.close();
    }
}