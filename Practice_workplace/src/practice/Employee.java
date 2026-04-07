package practice;

// Class demonstrating static variable
public class Employee {

    String name;      // Instance variable
    int id;           // Instance variable
    static String company = "TNSIF"; // Static variable (shared)

    // Constructor to initialize object
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee details
    void display() {
        System.out.println(name + " " + id + " " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("A", 1);
        Employee e2 = new Employee("B", 2);

        e1.display();
        e2.display();
    }
}