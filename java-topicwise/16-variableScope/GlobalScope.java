public class GlobalScope {

    static int count = 100; // Class variable

    static void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Count = " + count);

        display();
    }
}