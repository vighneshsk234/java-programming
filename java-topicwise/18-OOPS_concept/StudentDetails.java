import java.util.Scanner;

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
        System.out.println("\n----- Student Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        // Passing user input to the constructor
        Student student = new Student(name, age, course);

        // Displaying details
        student.displayDetails();

        sc.close();
    }
}