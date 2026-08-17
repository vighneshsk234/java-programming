// Generic class
class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void display() {
        System.out.println("Value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
    }
}

public class GenericsExample {

    public static void main(String[] args) {

        // Integer
        Box<Integer> intBox = new Box<>(100);
        intBox.display();

        System.out.println();

        // String
        Box<String> stringBox = new Box<>("Hello Java");
        stringBox.display();

        System.out.println();

        // Double
        Box<Double> doubleBox = new Box<>(25.5);
        doubleBox.display();
    }
}