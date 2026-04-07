package Decisionmaking;

public class OperatorPractice1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int c = ++a + b++;   // 6 + 10 = 16
        System.out.println("c: " + c);

        int d = a++ + ++b;   // 6 + 12 = 18
        System.out.println("d: " + d);
    }
}