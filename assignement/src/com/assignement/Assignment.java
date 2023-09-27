package com.assignement;
class Test
{
	int a=10;
	int b=20;
int add()
{
	return a+b;
}

int sub()
{
	return a-b;
}

int mul()
{
	return a*b;
}

int div()
{
	return a/b;
}
}
public class Assignment {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.add());
		System.out.println(t.sub());
		System.out.println(t.mul());
		System.out.println(t.div());
	}

}
