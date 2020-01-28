package CTSDemo;

import java.util.Scanner;

public class character {
private static Scanner p;
public static void main(String args[]) {
 	String sentence;//="Welcome to selenium";
	p = new Scanner(System.in);
	System.out.println("Enter the sentence   ");
	sentence=p.nextLine();
	int len =sentence.length();
	System.out.println("String length is : "+len);
	int a=p.nextInt();
	char ch=sentence.charAt(a);
	System.out.println("Character at the position is : "+ch);	
}
}
