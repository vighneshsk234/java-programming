public class WrapperClassExample {

    public static void main(String[] args) {

        // Primitive data type
        int number = 100;

        // Autoboxing (primitive → object)
        Integer integerObject = number;

        // Unboxing (object → primitive)
        int value = integerObject;

        System.out.println("Primitive int: " + number);
        System.out.println("Wrapper Integer: " + integerObject);
        System.out.println("Unboxed int: " + value);

        // Useful Wrapper Class Methods
        String text = "250";

        int convertedNumber = Integer.parseInt(text);
        System.out.println("String to int: " + convertedNumber);

        String str = Integer.toString(number);
        System.out.println("int to String: " + str);
    }
}