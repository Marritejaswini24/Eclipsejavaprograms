package CTSDemo;

import java.util.Scanner;

public class even {
	private static Scanner p;

	public static void main(String[] args)
	{
	p = new Scanner(System.in);
	int num;
	System.out.print("enter the num");
	num= p.nextInt();
	if(num%2==0)
	System.out.print("entered  num is even");
	else
	System.out.print("entered  num is odd");
	}

}
