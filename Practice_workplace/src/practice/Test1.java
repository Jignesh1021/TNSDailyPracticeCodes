package practice;

class Student {

    private int marks; // private variable

    // setter method
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // getter method
    public int getMarks() {
        return marks;
    }
}

public class Test1 {

    public static void main(String[] args) {

        Student s = new Student();

        // s.marks = 90; ❌ not allowed

        s.setMarks(90); // ✅ allowed
        System.out.println(s.getMarks());
    }
}