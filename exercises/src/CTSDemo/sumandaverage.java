package CTSDemo;

import java.util.Scanner;

public class sumandaverage {
	public static void main(String args[])
	{
int a[]= {1,2,3,4,5};
                        /*Scanner p=new Scanner(System.in);
                          a[j]=p.nextInt();
                          for( int j=0;j<5;j++)
                             {
	                           System.out.println("Enter the value"+j+ " :  "+a[j]);
                              }
                         */
int sum=0,average=0, i;
for( i=0;i<5;i++)
{
	sum=sum+a[i];
}
average=sum/(i);
System.out.println("sum of array:  "+sum);
System.out.println("average of array:  "+average);
}
}