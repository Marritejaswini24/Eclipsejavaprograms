package CTSDemo;

import java.util.Scanner;

public class fibanoci {
	private static Scanner p;

	public static void main (String args[])
	{
	int n1=0,n2=1,i,n,q= 0;
p = new Scanner(System.in);
System.out.println("enter the number");
n=p.nextInt();
for(i=0;i<=n;i++)
{
	q=n1+n2;
	n1=n2;
	n2=q;
	System.out.print(" "+q);
}
	}
}
