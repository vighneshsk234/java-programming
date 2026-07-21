class Student {

    // Private variables
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class GetterSetterExample {

    public static void main(String[] args) {

        Student student = new Student("Vighnesh", 20);

        // Using Getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Using Setters
        student.setName("Rahul");
        student.setAge(21);

        System.out.println("\nAfter Updating:");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}