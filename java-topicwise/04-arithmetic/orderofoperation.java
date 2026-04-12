public class orderofoperation {
    public static void main(String[] args) {

        // order of operations (PEMDAS/BODMAS):

        int result = 10 + 5 * 2; // Multiplication is performed before addition
        System.out.println("Result of 10 + 5 * 2: " + result); // Output: 20

        result = (10 + 5) * 2; // Parentheses change the order of operations
        System.out.println("Result of (10 + 5) * 2: " + result); // Output: 30

        result = 10 - 5 + 2; // Subtraction and addition are performed from left to right
        System.out.println("Result of 10 - 5 + 2: " + result); // Output: 7

        result = 10 / 5 * 2; // Division and multiplication are performed from left to right
        System.out.println("Result of 10 / 5 * 2: " + result); // Output: 4

        result = 10 % 3 + 1; // Modulus is performed before addition
        System.out.println("Result of 10 % 3 + 1: " + result); // Output: 2
        
    }
    
}