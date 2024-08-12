package com.exception.test;

public class Sample {
	public static void test(int a)
	{
		try
		{
		int [] ar1 = {10, 20, 30};
		System.out.println(ar1[a]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test(5);
		test(0);
	}

}
