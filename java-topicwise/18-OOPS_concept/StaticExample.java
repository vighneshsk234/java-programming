class Student {

    String name;
    int age;

    // Static variable (shared by all objects)
    static String college = "GEC Surat";

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    void displayDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
        System.out.println();
    }

    // Static method
    static void collegeInfo() {
        System.out.println("Welcome to " + college);
    }
}

public class StaticExample {

    public static void main(String[] args) {

        // Calling static method using class name
        Student.collegeInfo();

        System.out.println();

        Student student1 = new Student("Vighnesh", 20);
        Student student2 = new Student("Rahul", 21);

        student1.displayDetails();
        student2.displayDetails();

        // Changing the static variable
        Student.college = "IIT Bombay";

        System.out.println("After changing the college name:\n");

        student1.displayDetails();
        student2.displayDetails();
    }
}