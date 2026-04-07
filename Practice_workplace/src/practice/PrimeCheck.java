package practice;

// Program to check whether a number is prime
public class PrimeCheck {

    public static void main(String[] args) {

        int n = 7; // Number to check
        boolean isPrime = true;

        // Loop from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break; // Exit loop if divisible
            }
        }

        // Output result
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}