package com.oops.test;

public class Vowels {
	public static void vowels(char a)
	{
	switch (a)
	{
	case 'a':System.out.println(a + " is vowel");
	break;
	case 'e':System.out.println(a + " is vowel");
	break;
	case 'i':System.out.println(a + " is vowel");
	break;
	case 'o':System.out.println(a + " is vowel");
	break;
	case 'u':System.out.println(a + " is vowel");
	break;
	default:System.out.println("Invaild entery");
	}
	}
	public static void main(String [] args)
	{
		vowels('a');
	}

}
