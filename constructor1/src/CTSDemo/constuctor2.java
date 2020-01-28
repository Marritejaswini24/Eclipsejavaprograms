package CTSDemo;
public class constuctor2 
{
	int age;
	String name;
	String DOB;
	int centuries;
	int halfcenturies;
constuctor2(String b, int a, String c, int d, int e)
	{
	this.age=a;
	this.name= b;
	this.DOB=c;
	this.centuries=d;
	this.halfcenturies=e;
	}
public static void main(String args[]) 
	{
	constuctor2 q=new constuctor2("kalyan",22,"04/01/1998",5,9);
	constuctor2 p=new constuctor2("mahesh",21,"22/11/1998",6,10);
	System.out.println("Name   Age   DOB     100  50");
	System.out.println(q.name+" "+q.age+" "+q.DOB+"  "+q.centuries+"   "+q.halfcenturies);
	System.out.println(p.name+" "+p.age+" "+p.DOB+"  "+p.centuries+"   "+p.halfcenturies);
	} 
}