public class augmented {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Using augmented assignment operators
        a += b; // a = a + b
        System.out.println("After addition (a += b): " + a);

        a -= b; // a = a - b
        System.out.println("After subtraction (a -= b): " + a);

        a *= b; // a = a * b
        System.out.println("After multiplication (a *= b): " + a);

        a /= b; // a = a / b
        System.out.println("After division (a /= b): " + a);

        a %= b; // a = a % b
        System.out.println("After modulus (a %= b): " + a);
    }
    
}
