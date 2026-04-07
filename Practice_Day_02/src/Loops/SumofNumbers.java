package Loops;

public class SumofNumbers {

	public static void main(String[] args) {
		int i = 1;
	    int sum = 0;

	    do {
	        sum += i;
	        i++;
	    } while (i <= 5);

	    System.out.println("Sum: " + sum);

	}

}
