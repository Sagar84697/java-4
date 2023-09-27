package com.assignement;
import java.util.Scanner;

public class averageD {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the first number: ");
		 double number1 = sc.nextDouble();

		 System.out.print("Enter the second number: ");
		 double number2 = sc.nextDouble();

		 double average = (number1 + number2) / 2.0;

		 System.out.println("The average of " + number1 + " and " + number2 + " is: " + average);
		    }


	

}
