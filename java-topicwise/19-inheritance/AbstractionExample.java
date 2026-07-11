abstract class Shape {

    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class AbstractionExample {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.display();
        circle.draw();

        System.out.println();

        rectangle.display();
        rectangle.draw();
    }
}