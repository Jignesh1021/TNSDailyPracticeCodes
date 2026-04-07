package practice;

// Class demonstrating final variable
class FinalDemo {

    final int x = 100; // Final variable cannot be changed

    // Method to display value
    void display() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        FinalDemo f = new FinalDemo();
        f.display();
    }
}