package com.exception.test;

public class Finally {
	public static void test(int a) {
		
	
	try
	{
		System.out.println(100/a);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("finally");
		System.out.println("----------");
	}

}
	

public static void main(String[] args) {
	test(1);
	test(0);
	test(5);
}
}
