package com.assignement;
class Car
{
	private String make;
	private String model;
	private int year;
	private String color;
	
	Car(String make,String model,int year,String color)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
		
		System.out.println("The car has started");
	}
	
	String make()
	{
		return make;
	}
	
	String model()
	{
		return model;
	}
	
	int year()
	{
		return year;
	}
	
	String color()
	{
		return color;
	}
	void start()
	{
		System.out.println("car has started!");
	}
}
public class Lunchcar {

	public static void main(String[] args) {
	Car c=new Car("Toyato","Camry",2020,"red");
	 
	 System.out.println(c.make());
	 System.out.println(c.model());
	 System.out.println(c.year());
	 System.out.println(c.color());
	}

}
