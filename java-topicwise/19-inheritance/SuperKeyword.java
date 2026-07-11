class Person {

    String name;
    int age;

    // Parent constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Parent method
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {

    String course;

    // Child constructor
    Student(String name, int age, String course) {

        super(name, age);      // Calls the parent constructor

        this.course = course;
    }

    // Child method
    void displayStudent() {

        super.display();       // Calls the parent method

        System.out.println("Course : " + course);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Student student = new Student(
                "Vighnesh",
                20,
                "Computer Engineering"
        );

        student.displayStudent();
    }
}