package com.assignement;
import java.util.Scanner;

public class asst1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first boolean");
		 boolean b1 = sc.nextBoolean();
		System.out.println("enter the second boolean");
		 boolean b2 = sc.nextBoolean();
		 
		 boolean  And = b1 && b2;
				 {
			 System.out.println("logicalAnd  :" + b1 + "&&" + b2 + "=" + And);
				 }
				 
				 boolean or = b1 || b2;
						 {
					 System.out.println("logicalor  :" + b1 + "||" + b2 + "=" + or);
						 }
						 
				boolean Not = !b1;
				{
					System.out.println("logicalNot  :"+ "!" + b1 + "=" + Not);
				}
				boolean Not2 = !b2;
				{
					System.out.println("logicalNot2  :"+ "!" + b2 + "=" + Not);
				}
	}

}
