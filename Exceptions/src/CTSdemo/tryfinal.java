package CTSdemo;

public class tryfinal {
	public static void main(String args[])
	{
		
		try
		{
			int a=10,b=0;
			int c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown:      " +e);
		}
	finally
	{
		System.out.println("Inside the finally block");
	}

}
}
