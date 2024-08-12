package com.exception.test;

public class Sample1 {
	public static void test(String s1) {
		try {
			String str = null;
			if (str.equals(s1))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		test ("hello");
		test ("hi");
		test ("hello");
		System.out.println("Mrng");
	}

}
