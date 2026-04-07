package practice;

// Parent class
class Person {
    String name;

    // Constructor of parent class
    Person(String name) {
        this.name = name;
    }
}

// Child class inheriting Person
class Student extends Person {
    int roll;

    // Constructor calling parent constructor using super
    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    // Method to display details
    void display() {
        System.out.println(name + " " + roll);
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        Student s = new Student("Jignesh", 101);
        s.display();
    }
}