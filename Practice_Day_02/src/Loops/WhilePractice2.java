package Loops;

public class WhilePractice2 {

    public static void main(String[] args) {
    	//Factorial
        int i = 1;
        int fact = 1;

        while (i <= 5) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial: " + fact);
    }
}