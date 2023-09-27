package com.assignement;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number: ");
		int num1=sc.nextInt();
		System.out.println("enter a second number: ");
		int num2=sc.nextInt();

		System.out.println("before swapping :");
		System.out.println("first integer :"+ num1);
		System.out.println("second integer :"+ num2);
		
		
		num1= num1 ^ num2;
		num2=num1^num2;

		

		System.out.println("after swapping :");
		System.out.println("first integer :"+ num1);
		System.out.println("second integer :"+ num2);
	}

}
