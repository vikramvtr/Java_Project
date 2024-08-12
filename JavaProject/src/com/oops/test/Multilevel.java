package com.oops.test;

public class Multilevel
{
	public void sendmsg()
	{
		System.out.println("test msg");
	}
}
class Multilevel extends Multilevel v1
{
	public void sendvoicemsg()
	{
		System.out.println("voicemsg");
	}
}
class Multilevel extends Multilevel v2
{
	public void videocall()
	{
		System.out.println("videocall");
	}
}
class mainuser
{
	public static void main(String [] args)
	{
		Multilevel m3 = new Multilevel();
		m3=sendmsg();
		m3=sendvoicemsg();
		m3=videocall();
	}
}