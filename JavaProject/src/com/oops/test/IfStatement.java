package com.oops.test;

public class IfStatement {

	public static void checknum(int num) {
		if(num>100)
		{
			System.out.println(num +" is greater then 100");
		}
	}
	public static void main(String[] args) {
		checknum(105);
		checknum(80);
	}

}
