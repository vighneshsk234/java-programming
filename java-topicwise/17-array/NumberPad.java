public class NumberPad {

    public static void main(String[] args) {

        char[][] keypad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        System.out.println("Mobile Number Pad:\n");

        for (char[] row : keypad) {
            for (char key : row) {
                System.out.print("[" + key + "] ");
            }
            System.out.println();
        }
    }
}