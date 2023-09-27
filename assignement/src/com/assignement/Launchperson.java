package com.assignement;
class Person
{
	private String name;
	private int age;
	private String gender;
	
	Person(String name, int age, String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	 void introduce()
	{
		System.out.println("hi my name is " + name + " i am "  + age + " years old and I am " + gender);
	}

	
   
}

public class Launchperson {

	public static void main(String[] args) {
		Person p=new Person("jhon",25,"male");
		p.introduce();
		
	}

}
