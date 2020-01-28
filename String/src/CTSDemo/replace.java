package CTSDemo;
import java.util.Scanner;
public class replace {
	private static Scanner p;

	public static void main(String args[]) {
		p = new Scanner(System.in);
	 	String sentence1;
	 	System.out.print("Enter the string :");//="           Welcome to selenium            ";
	 	sentence1=p.nextLine();
	 	System.out.println("After trimming space : "+sentence1.trim());
	 	String s1;           
	 	System.out.print("Enter the sring to be changed:");
	 	s1=p.nextLine();
	 	String s2=s1.replace('a','e');        
	 	System.out.println("After replacement : "+s2);
}
}