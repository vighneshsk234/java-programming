class Animal {

    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {

    @Override
    void sound() {
        System.out.println("The cow moos.");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {

        // Parent reference, Child objects
        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();

        animal = new Cow();
        animal.sound();
    }
}