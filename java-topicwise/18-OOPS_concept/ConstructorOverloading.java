class Student {

    // Attributes
    String name;
    int age;
    String course;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 18;
        course = "Not Assigned";
    }

    // Constructor with 1 parameter
    Student(String name) {
        this.name = name;
        age = 0;
        course = "Not Assigned";
    }

    // Constructor with 2 parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }

    // Constructor with 3 parameters
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

public class ConstructorOverloading {

    public static void main(String[] args) {

        // Calls Default Constructor
        Student student1 = new Student();

        // Calls Constructor with 1 Parameter
        Student student2 = new Student("Vighnesh");

        // Calls Constructor with 2 Parameters
        Student student3 = new Student("Rahul", 21);

         // Calls Constructor with 2 Parameters
        Student student4 = new Student("Ram", 21, "Mechanical Engineering");
        
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        
    }
}