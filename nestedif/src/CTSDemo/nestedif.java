package CTSDemo;

import java.util.Scanner;

public class nestedif {

	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		
		double amount;
		amount = p.nextInt();
		double withdraw;
			if (amount<=100){
			withdraw=10;
			}else if(amount<=500){
            withdraw=5;
			}else if(amount<=1000){
			withdraw=2;
			}else {
				withdraw=1;
				}
System.out.println(withdraw);
	}
}
