package practice;

class Demo {

    private void show() {
        System.out.println("Private method called");
    }

    public void display() {
        show(); // calling private method inside class
    }
}

public class Test2 {

    public static void main(String[] args) {

        Demo d = new Demo();
        d.display(); // allowed

        // d.show(); not allowed
    }
}