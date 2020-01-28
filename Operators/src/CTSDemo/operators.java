package CTSDemo;
import java.util.Scanner;
public class operators {
private static Scanner p;

public static void main(String args[])
{
	int num,r=0,count=0,temp;
	Scanner p = new Scanner(System.in);
	System.out.print("Enter a number:  ");
	num=p.nextInt(); 
	temp=num;
		while(num!=0)
	{
		r=num%2;
		if(r==1) {
			count++;
					}
		num=num/2;
							} 
	System.out.println("Binary number of "+num+" is: "+Integer.toBinaryString(temp));	
	System.out.print("The number of ones is  "+count);
}
}
