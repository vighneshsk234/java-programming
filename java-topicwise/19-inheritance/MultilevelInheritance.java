class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department : " + department);
    }

    void manageTeam() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Manager manager = new Manager("Vighnesh", 101, "Software Development");

        // Grandparent class method
        manager.introduce();

        // Parent class method
        manager.work();

        // Child class methods
        manager.displayDetails();
        manager.manageTeam();
    }
}