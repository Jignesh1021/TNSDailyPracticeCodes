package Loops;

public class ForEachPractice1 {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}