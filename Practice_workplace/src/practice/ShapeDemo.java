package practice;

// Parent class
class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

// Child classes
class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}