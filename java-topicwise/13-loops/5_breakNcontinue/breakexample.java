public class breakexample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println(i);
        }

        System.out.println("Loop exited.");
    }
}