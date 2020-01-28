package CTSDemo;

import java.util.Random;

public class random {
public static void main(String args[])
{
	int c;
	Random t=new Random();
			for(c=1;c<=10;c++)
	{
		System.out.print(t.nextInt(5)+"   ");
	}
}
}


