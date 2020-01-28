package CTSDemo;

public class kalyan {
	int age;
	String name;
		kalyan(){
		
	this.age=22;
	this.name="kalyan";
		}
	kalyan(String n, int a)
			{
		this.age=a;
		this.name= n;
			}
		public static void main(String args[]) {
		kalyan p=new kalyan();
		kalyan q=new kalyan("babu",60);
		System.out.println(p.name+" "+p.age);
		System.out.println(q.name+" "+q.age);
		
	}
}
