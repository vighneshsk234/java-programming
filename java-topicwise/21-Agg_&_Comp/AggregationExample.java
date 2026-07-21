class Address {

    String city;
    String state;

    // Constructor
    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

class Student {

    String name;
    int age;

    // Aggregation (HAS-A relationship)
    Address address;

    // Constructor
    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        address.displayAddress();
    }
}

public class AggregationExample {

    public static void main(String[] args) {

        // Address object exists independently
        Address address = new Address("Surat", "Gujarat");

        // Student HAS-A Address
        Student student = new Student("Vighnesh", 20, address);

        student.displayStudent();
    }
}