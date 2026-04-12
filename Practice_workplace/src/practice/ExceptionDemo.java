package practice;

public class ExceptionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b; // may cause exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program ended");
        }
    }
}