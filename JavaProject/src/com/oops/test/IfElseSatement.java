package com.oops.test;

public class IfElseSatement {

	public static void checknum(int num) {
		if(num > 100)
		{
			System.out.println(num + " is greter then 100");
		}
		else
		{
			System.out.println(num + " is less then 100");
		}

	}
	public static void main(String[] args) {
		checknum(101);
		checknum(205);
		checknum(59);
	}

}
