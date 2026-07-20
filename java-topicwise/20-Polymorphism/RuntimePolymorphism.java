class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        // Parent class reference
        Animal animal;

        // Runtime Polymorphism
        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}