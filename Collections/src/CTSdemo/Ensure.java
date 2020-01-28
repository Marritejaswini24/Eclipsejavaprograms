package CTSdemo;

import java.util.ArrayList;

public class Ensure {
	public static void main(String[] args)
	{
		ArrayList<String>List1=new ArrayList<>(4);
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		System.out.println(List1);
		List1.ensureCapacity(10);
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		System.out.println(List1);
		

}
}
