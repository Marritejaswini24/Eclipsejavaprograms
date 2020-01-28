package CTSDemo;

import java.util.Scanner;

public class Ones {
	private static Scanner p;

	public static void main(String args[])
	{
		int num;
		p = new Scanner(System.in);
		System.out.print("Enter a number:  ");
		num=p.nextInt(); 
		System.out.println(" The Number of one's in: "+num+"("+Integer.toBinaryString(num)+")");
				//    int result=countOne(num);
				//System.out.println(" is : "+result);
				//p.close();
	}
	/*static int countOne(int n) {
		int count=0;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		return count;
	}*/
}
