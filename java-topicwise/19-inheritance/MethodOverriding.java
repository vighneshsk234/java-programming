class Animal {

    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.sound();
        dog.sound();
        cat.sound();
    }
}