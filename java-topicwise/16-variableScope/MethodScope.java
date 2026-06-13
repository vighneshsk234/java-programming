public class MethodScope {

    static void display() {

        int num = 10; // Local to display()

        System.out.println(num);
    }

    public static void main(String[] args) {

        display();

        // System.out.println(num); // Error
    }
}