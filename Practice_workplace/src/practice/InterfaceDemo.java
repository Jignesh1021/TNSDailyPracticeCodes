package practice;

// Interface
interface Animal {
    void sound();
}

// Class implementing interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}