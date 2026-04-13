import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double totalCost = 0.0;

        System.out.print("Which item would you like to buy? : ");
        item = scanner.nextLine();        
        System.out.println(item);
        
        System.out.print("What is the price of the item? : ");
        price = scanner.nextDouble();
        System.out.println(price);

        System.out.print("How many would you like to buy? : ");
        quantity = scanner.nextInt();
        System.out.println(quantity);
        
        totalCost = price * quantity;

        System.out.println("You have chosen to buy " + quantity + " " + item + "(s) at a price of " + currency + price + " each.");
        System.out.println("The total cost of your purchase is: " + currency + totalCost);
        scanner.close();

    }
}
