class Car {

    // Attributes
    String brand;
    String model;
    int year;
    String color;

    // Method
    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Color : " + color);
        System.out.println();
    }
}

public class cardetail {

    public static void main(String[] args) {

        // Object 1
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Fortuner";
        car1.year = 2024;
        car1.color = "Black";

        // Object 2
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "City";
        car2.year = 2023;
        car2.color = "White";

        // Calling methods
        car1.displayDetails();
        car2.displayDetails();
    }
}