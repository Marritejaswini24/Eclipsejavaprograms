package CTSdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Removeall {
	public static void main(String[] args)
	{
		ArrayList<String>List1=new ArrayList<>();
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		List1.add("Tejaswini");
		List1.add("Tejaswini");
		List1.add("Tejaswini");
		System.out.println("Before removing:" +List1);
		List1.removeAll(Collections.singleton("Tejaswini"));
		System.out.println("After removing:" +List1);

}
}
