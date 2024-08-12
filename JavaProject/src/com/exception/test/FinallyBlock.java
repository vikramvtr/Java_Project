package com.exception.test;

public class FinallyBlock {
	public static void test(int a) {
		try
		{
			int res = 100/a;
			System.out.println(res);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			int[]ar1= {10,20,30};
			System.out.println(ar1[a]);
		}
	
		
	}
	public static void main(String[] args) {
		{
			test(5);
			test(0);
			test(1);
		}
	}

}
