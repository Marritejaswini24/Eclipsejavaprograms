package CTSDemo;

import java.util.Scanner;

public class Compare {
	private static Scanner p;
	public static void  main(String args[]) {
		int c;
		String name;
		String name1;
		p = new Scanner(System.in);
		name=p.nextLine();
		name1=p.nextLine();
			c=name.compareTo(name1);
	System.out.println("length "+c);
		
	}
}

