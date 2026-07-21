class Engine {

    void startEngine() {
        System.out.println("Engine started.");
    }
}

class Car {

    private String brand;
    private Engine engine;

    // Constructor
    Car(String brand) {
        this.brand = brand;

        // Composition: Engine is created inside Car
        engine = new Engine();
    }

    void startCar() {
        System.out.println("Car Brand: " + brand);
        engine.startEngine();
        System.out.println("Car is ready to drive.");
    }
}

public class CompositionExample {

    public static void main(String[] args) {

        Car car = new Car("Toyota");
        car.startCar();
    }
}