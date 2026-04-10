package practice;

class Singleton {

    private Singleton() {
        System.out.println("Private constructor");
    }

    public static void createObject() {
        Singleton s = new Singleton(); // allowed inside class
    }
}

public class Test3 {

    public static void main(String[] args) {

        // Singleton s = new Singleton(); not allowed

        Singleton.createObject(); // allowed
    }
}