package CTSdemo;

import java.util.ArrayList;

public class Get {
	public static void main(String[] args)
	{
		ArrayList<String>List1=new ArrayList<>();
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		System.out.println(List1);
		String name=List1.get(0);
		String name1=List1.get(1);
		System.out.println(name);
		System.out.println(name1);

}
}
