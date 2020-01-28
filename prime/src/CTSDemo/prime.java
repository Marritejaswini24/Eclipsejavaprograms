package CTSDemo;

import java.util.Scanner;

public class prime {
	private static Scanner b;
	private static Scanner c;
	public static void main(String[] args)
	{
	int i,a,num,p,q;
	b = new Scanner(System.in);
	System.out.print("enter lowest limit: ");
	p=b.nextInt();
	c = new Scanner(System.in);
	System.out.print("enter highest limit: ");
	q=c.nextInt();
	for(num=p;num<q;num++)
	{
		a=0;
		for(i=1;i<=num;i++)
	{
	if(num%i==0)
	a++;
	}
	if(a==2)
	System.out.print(num+" ");
	}
	}
}
