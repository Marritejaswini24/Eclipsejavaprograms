package CTSdemo;

import java.util.Scanner;

public class number {
	public static void main(String args[])
	{
		
		try
		{
			int a;
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("num:"+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("end of the main");
}
}
