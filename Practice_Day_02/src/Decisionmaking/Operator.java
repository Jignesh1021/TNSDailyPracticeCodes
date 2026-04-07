package Decisionmaking;

public class Operator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a and b value before the operator : "
		+ a+ " "+ b);
		
		++a;  //per
		
		
		  
		    // 12 + 20 + 12  
		int c=++a + b + a--; //44
		System.out.println("C value after the operator :"+ c);
		
		    // 44 + 11 + 20 
		int d=c++ + a + b--;  //75
		System.out.println("D value after the operator : "+ d);
		
		     //44 + 75  + 73  + 46 +  73  + 75  == 388
		int e=c++ + d-- + --d + ++c + d++ + ++d;
		System.out.println("E value after the operator :"+ e);

	}

}
