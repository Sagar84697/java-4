package com.assignement;
import java.util.Scanner;

public class asst3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("enter the second number: ");
		int num2=sc.nextInt();
		
		int And = num1&num2;
		{
			System.out.println("bitwise And: "+ num1 + "&" + num2 + "=" + And);
		}
		int or = num1|num2;
		{
			System.out.println("bitwise or: "+ num1 + "|" + num2 + "=" + or);
		}
		int xor = num1^num2;
		{
			System.out.println("bitwise xor: "+ num1 + "^" + num2 + "=" + xor);
		}
		int not1 = ~num1;
		{
			System.out.println("bitwise not1: "+ "~" + num1 + "=" + not1);
		}
		int not2 = ~num2;
		{
			System.out.println("bitwise not2: "+ "~" + num2 + "=" + not2);
		}
		
	}

}
