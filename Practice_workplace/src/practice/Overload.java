package practice;

// Class demonstrating method overloading
public class Overload {

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overload o = new Overload();

        // Calling overloaded methods
        System.out.println(o.add(2, 3));
        System.out.println(o.add(2, 3, 4));
    }
}