package Loops;
import java.lang.reflect.Array;

public class Foreachloop {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		
		//for integer array
		for (int storeNormalData : a)
		{
			System.out.print(storeNormalData+ " ");
		}
		
		System.out.println();
		
		char ch[]= {'j','a','v','a'};
		for(char c: ch)
		{
			System.out.print(c);
		}
	}

}
