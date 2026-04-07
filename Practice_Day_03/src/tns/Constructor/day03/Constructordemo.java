package tns.Constructor.day03;

import java.util.Scanner;

public class Constructordemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name, city;
		int id;
		System.out.println("Enter Custonmer ID: ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name :");
		name = sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		System.out.println("    ");
		
		Customer c1=new Customer(); //default obj
		
		c1.setCustomerCity(city);
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		System.out.println(c1);
		
		System.out.println("Enter Custonmer ID: ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name :");
		name = sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		System.out.println("    ");
		
		Customer c2=new Customer(name, id, city);
		System.out.println(c2);

	}

}