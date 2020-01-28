package CTSDemo;

import java.util.Scanner;

public class logical {
private static Scanner p;
public static void main(String[] args) {
String username;
String password;
p = new Scanner(System.in);
System.out.print("Enter User name: ");
username= p.next();
System.out.print("Enter Password: ");
password= p.next();
if((username.equals("kalyan"))&&(password.equals("Kalyan4872")))
{
	System.out.println("Welcome");
}
else 
{
	System.out.println("username/Password is incorrect");
}
}
}