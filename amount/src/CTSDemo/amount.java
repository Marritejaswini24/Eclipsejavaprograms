package CTSDemo;

import java.util.Scanner;

public class amount {
	private static Scanner p;

	public static void main(String args[])
	{
	int bln;
	p = new Scanner(System.in);
	System.out.println("please enter amount");
	bln=p.nextInt();
if(bln>=0)
{
		if(bln<1000)
	{
	System.out.println("please enter more than 1000");
	}
	if(bln>=1000)
	{
	System.out.println("Yout transaction is being proccessed");
	}
	
}
System.out.println("please enter valid amount");
	}
}
