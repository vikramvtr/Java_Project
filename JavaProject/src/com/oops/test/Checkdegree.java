package com.oops.test;

public class Checkdegree {
	public static void degree(String branch)
	{
		if(branch == "CS" || branch == "IS" || branch == "IT" || branch=="EC")
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
	public static void main(String[] args) {
		degree("CS");
		degree("IS");
		degree("ME");
	}

}
