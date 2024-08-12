package com.oops.test;

public class IfelaseIFSatement {

	public static void checknum(int num) {
		if (num > 100)
		{
			System.out.println(num + " is greter then 100");
		}
		else if(num<100)
		{
			System.out.println(num + " is less then 100");
		
		}
		else
		{
			System.out.println(num +" is equle to 100");
		}

	}
	public static void main(String[] args) {
		checknum(108);
		checknum(100);
		checknum(25);
	}

}
