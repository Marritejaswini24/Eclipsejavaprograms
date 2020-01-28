package CTSDemo;

import java.util.Scanner;

public class palindrone {
	public static void main(String[] args)
	{
	Scanner p=new Scanner(System.in);
	int num,rem,sum=0,temp;
	System.out.println("enter the num");
	num=p.nextInt();
	temp=num;
	while(num!=0)
	{
	rem=num%10;
	sum=sum*10+rem;
	num=num/10;
	}
	if(sum==temp)
	System.out.println("palindrone");
	else
	System.out.println("not a palindrone");
	}
}
