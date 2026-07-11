class Animal {

    String name;

    // Parent class constructor
    Animal(String name) {
        this.name = name;
    }

    // Parent class method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class
class Dog extends Animal {

    String breed;

    // Child class constructor
    Dog(String name, String breed) {
        super(name);      // Calls the parent constructor
        this.breed = breed;
    }

    // Child class method
    void bark() {
        System.out.println(name + " is barking.");
    }

    void displayDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Breed : " + breed);
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog dog = new Dog("Tommy", "Golden Retriever");

        dog.displayDetails();
        dog.eat();      // Inherited method
        dog.bark();     // Child class method
    }
}