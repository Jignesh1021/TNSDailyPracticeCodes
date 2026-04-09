package pack2;

import pack1.Student;

public class Test2 {

    public static void main(String[] args) {

        Student s = new Student("Jignesh"); // ✅ constructor access
        s.display();
    }
}