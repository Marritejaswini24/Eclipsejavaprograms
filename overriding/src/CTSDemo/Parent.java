package CTSDemo;

public class Parent {                    //Base class
	public  void method() {
		System.out.println("parent's method()");
		
	}}
	class Child extends Parent {                //Inherited class
	public  void method() {
		System.out.println("Child's method()");
		
	}

}
class MethodOverriding{            //Driver class
	public static void main(String args[]) {
		Parent p=new Parent();
		p.method();
		Parent q=new Child();
		q.method();
	}
}
