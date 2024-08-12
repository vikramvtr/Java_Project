package com.oops.test;

public class Account {
	long accno;
	double bal;
	String owner;
	public void deposit (double amt) 
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("current bal"+bal);
		}
		else
		{
			System.out.println("Invalid Tras");
		}
	}
	public void withdrow (double amt)
	{
		if(amt>=0 && bal>=amt)
		{
			bal=bal-amt;
			System.out.println("current bal"+bal);
		}
		else
		{
			System.out.println("Insufficient bal");
		}
	}
	class Saving extends Account
	{
		double roi=0.05;
		public void calculateRoi()
		{
			bal=bal+bal*roi;
			System.out.println("with roi bal=" +bal);
		}
	}
	class current extends Account
	{
		double minbal=5000.0;
		public void showmybal()
		{
			System.out.println("minbal"+minbal);
		}
	}
	class mainuser
	{
		public static void main(String [] main)
		{
			Saving s1 = new Saving();
			s1.deposit(500.0);
			s1.withdrow(500.0);
			s1.calculateRoi();
			
			current c1 = new current();
			c1.deposit(500.0);
			c1.withdrow(500.0);
			c1.showmybal();

		}
	}

}
