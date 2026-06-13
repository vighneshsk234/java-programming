public class userinputadd {
    
    // Method with parameters and return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = add(num1, num2);

        System.out.println("Sum = " + result);

        scanner.close();
    }
}
