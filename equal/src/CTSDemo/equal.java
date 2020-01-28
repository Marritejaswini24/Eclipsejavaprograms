package CTSDemo;

import java.util.Scanner;

public class equal {
	public static void main(String args[])
	{
	int a;
	int b;
	Scanner p = new Scanner(System.in);
	System.out.println("enter a value");
	a= p.nextInt();
	System.out.println("enter b value");
	b= p.nextInt();
	if(a==b)
	System.out.println("the two numbers are equal");
	else 
	System.out.println("the two numbers are not equal");
	}
}
