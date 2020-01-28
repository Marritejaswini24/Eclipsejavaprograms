package CTSDemo;

public class ABC {
	void disp() {
		System.out.println("parent's class()");
		
	}}
	class Demo extends ABC {                //Inherited class
     void disp() {
		System.out.println("Child's class()");
			}
	 void newMethod() {
		System.out.println("new method of child class");
	}

	public static void main(String args[]) {
		ABC p=new ABC();
		p.disp();
		ABC q=new Demo();
		q.disp();
		Demo r=new Demo();
		r.newMethod();
	}
}
