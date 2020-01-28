package CTSDemo;

import java.util.Scanner;

public class addition {
private static Scanner p;

public static void main(String args[])
	{
	p = new Scanner(System.in);
	int a,b,c;
	System.out.print("a=");
	a=p.nextInt();
	System.out.print("b=");
	b=p.nextInt();
	c=a+b;
	System.out.println("Addition:"+c);
	}

}
