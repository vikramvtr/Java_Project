package com.oops.test;

public class CalculatorSwtich {
	public static void  calcul(int a, int b, String opr)
	{
		switch(opr)
		{
		case "+" :{ System.out.println(a+b);
		break;}
		case "-" : { System.out.println(a-b);
		break;}
		case "*" : { System.out.println(a*b);
		break;}
		case "/" : { System.out.println(a/b);
		break;}
		default : { System.out.println(0);
		break;}
		}
	}
	public static void main(String[] args)
	{
		calcul(10,6,"+");
		calcul(10,6,"-");
		calcul(10,6,"*");
	}

}
