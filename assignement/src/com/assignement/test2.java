package com.assignement;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("enter the first number: ");
		int num2=sc.nextInt();
		
		int result = num1 * 2; 
		 result =  result + 5;
		 result = result * 50;
		 result = result - 365;
		 result = result/num2;
System.out.println(result);
		
	}

}
