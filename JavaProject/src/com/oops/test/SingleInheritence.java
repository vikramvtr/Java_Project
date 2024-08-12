package com.oops.test;

public class SingleInheritence {
	final int v1=10;
	String str = "abc";
	public void test ()
	{
		System.out.println("test");
	}
	public void count()
	{
		System.out.println("count no");
	}

}
public class Demo extends SingleInheritence
{
	double z1=10.0;
	public void display()
	{
		System.out.println("display the death");
	}
}
class main
{
	public static void main(String [] args)
	{
		Demo d1= new Demo();
		d1.display();
		d1.count();
		d1.test();
		System.out.println(d1.z1);
		System.out.println(d1.v1);
		System.out.println(d1.str);
		
	}
}
