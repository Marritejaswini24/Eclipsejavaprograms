package CTSDemo;

import java.util.Scanner;

public class Length {
	private static Scanner p;
	public static void  main(String args[]) {
	String sentence;
	p = new Scanner(System.in);
	sentence=p.nextLine();          
int len = sentence.length();
System.out.println("length of the string :  "+len);
}
}