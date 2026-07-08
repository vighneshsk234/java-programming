class Student {

    // Attributes
    String name;
    int age;
    String course;

    // Constructor
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method
    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

public class StudentConstructor {

    public static void main(String[] args) {

        // Creating objects using the constructor
        Student student1 = new Student("Vighnesh", 20, "Computer Engineering");
        Student student2 = new Student("Rahul", 21, "Mechanical Engineering");

        // Calling the method
        student1.displayDetails();
        student2.displayDetails();
    }
}