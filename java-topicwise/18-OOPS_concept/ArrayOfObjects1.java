class Student {

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

public class ArrayOfObjects1 {

    public static void main(String[] args) {

        // Creating an array of objects directly
        Student[] students = {
            new Student("Vighnesh", 20, "Computer Engineering"),
            new Student("Rahul", 21, "Mechanical Engineering"),
            new Student("Priya", 19, "Civil Engineering"),
            new Student("Amit", 22, "Electrical Engineering")
        };

        System.out.println("----- Student Details -----\n");

        // Using enhanced for loop
        for (Student student : students) {
            student.displayDetails();
        }
    }
}