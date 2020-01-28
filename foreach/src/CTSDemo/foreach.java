package CTSDemo;

public class foreach {

public static void main(String args[])
{
int arr[]={12,33,45,50};
int sum=0;
for(int i:arr)
	sum=sum+i;
System.out.println("sum:"+sum );
}
}
