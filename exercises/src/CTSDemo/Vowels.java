package CTSDemo;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args)
	{
		String a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' '||ch=='A'||ch=='E'||ch=='I'||ch=='U')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	

}















