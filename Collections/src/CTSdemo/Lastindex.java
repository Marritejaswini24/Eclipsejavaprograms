package CTSdemo;

import java.util.ArrayList;

public class Lastindex {
	public static void main(String[] args)
	{
		ArrayList<String>List1=new ArrayList<>();
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		System.out.println(List1);
		int a=List1.lastIndexOf("Tejaswini");
		System.out.println(a);
	    a=List1.lastIndexOf("Mahesh");
	    System.out.println(a);

}

}
