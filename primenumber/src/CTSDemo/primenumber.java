package CTSDemo;

import java.util.Scanner;

public class primenumber {
	private static Scanner p;

	public static void main(String[] args)
	{
	int i,num ,a=0;
	p = new Scanner(System.in);
	System.out.println("enter a number");
	num = p.nextInt();
		for(i=1;i<=num;i++)
	{
	if(num%i==0)
	{
	a++;
	}
	}
	if(a==2)
	System.out.println("prime");
	else
	System.out.println("not prime");
	}
}
