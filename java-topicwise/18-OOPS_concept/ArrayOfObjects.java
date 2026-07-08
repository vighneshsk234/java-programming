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

public class ArrayOfObjects {

    public static void main(String[] args) {

        // Creating objects
        Student student1 = new Student("Vighnesh", 20, "Computer Engineering");
        Student student2 = new Student("Rahul", 21, "Mechanical Engineering");
        Student student3 = new Student("Priya", 19, "Civil Engineering");

        // Creating an array of objects
        Student[] students = {student1, student2, student3};

        System.out.println("----- Student Details -----\n");

        // Using enhanced for loop
        for (Student student : students) {
            student.displayDetails();
        }
    }
}