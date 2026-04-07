package practice;

// Class to store student details and evaluate result
public class StudentResult {

    String name;
    int marks;

    // Parameterized constructor to initialize values
    StudentResult(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to check result based on marks
    void result() {
        if (marks >= 75)
            System.out.println(name + " → Distinction");
        else if (marks >= 50)
            System.out.println(name + " → Pass");
        else
            System.out.println(name + " → Fail");
    }

    // Main method
    public static void main(String[] args) {
        StudentResult s = new StudentResult("Jignesh", 68);
        s.result();
    }
}