package com.assignement;
import java.util.Scanner;

public class modules {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
       System.out.println("enter the num: ");
       int num = sc.nextInt();
       
       if(num % 2==0)
       {
    	   System.out.println(num + " it is even number");
       }
       else
       {
    	   System.out.println(num + " it is odd number");
       }

	}

}
