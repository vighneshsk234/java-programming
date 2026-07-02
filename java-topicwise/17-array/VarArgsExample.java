public class VarArgsExample {

    // Method to calculate the sum
    static int add(int... numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    // Method to calculate the average
    static double average(int... numbers) {

        if (numbers.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + add(10, 20, 30, 40, 50));
        System.out.println("Average = " + average(10, 20, 30, 40, 50));

        // No arguments passed
        System.out.println("\nWhen no numbers are passed:");
        System.out.println("Sum = " + add());
        System.out.println("Average = " + average());
    }
}