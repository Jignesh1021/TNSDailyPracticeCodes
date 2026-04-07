package practice;

// Program to calculate sum of array elements
public class ArraySum {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30}; // Array declaration
        int sum = 0;

        // For-each loop to iterate array
        for (int num : arr) {
            sum += num;
        }

        // Print result
        System.out.println("Sum: " + sum);
    }
}