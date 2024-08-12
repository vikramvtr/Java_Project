package com.exception.test;

import java.security.DomainCombiner;
import java.security.PublicKey;

public class CustumizedException {
	double bal;
	public void desposit(double amt) {
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println(bal);
		}
		else
		{
			try
			{
				throw new NegativeinputException("Negative amt is not valid");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
	public void withdraw(double amt) {
		
			if(amt >=0 && bal>=amt)
			{
				bal=bal-amt;
				System.out.println(bal);
			}
			else
			{
				try
				{
					throw new InsufficientbalException("bal not found");
				}
				catch(Exception ei)
				{
					ei.printStackTrace();
				}
			}
		}
		public static void main(String [] args)
		{
			CustumizedException a1=new CustumizedException();
			a1.desposit(5000);
			a1.desposit(1000);
			a1.desposit(-500);
			a1.desposit(4000);
		}

	}
	class NegativeinputException extends Exception
	{
		NegativeinputException(String msg){
	
	super (msg);
		}
}
class InsufficientbalException extends Exception
{
	InsufficientbalException(String msg){


super (msg);
}
}