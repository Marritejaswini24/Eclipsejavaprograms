package CTSDemo;

import java.util.Scanner;

public class uppercase {
	private static Scanner p;

	public static void main(String args[])
	{
		String name,name1;
		p = new Scanner(System.in);
		System.out.print("Enter name     ");
		name=p.next();
	name1=name.toUpperCase();
	System.out.println("In Uppercase   "+name1);
	name1=name.toLowerCase();
	System.out.println("In Lowercase   "+name1);	
			}
}
