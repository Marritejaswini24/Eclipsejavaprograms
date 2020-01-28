package CTSdemo;

import java.util.ArrayList;

public class List {
public static void main(String[] args)
{
	
	 ArrayList <String>List1 =new ArrayList<>();
	 List1.add("Satyanarayana");
	 List1.add("Chaitanya");
	 List1.add("kalyan Babu");
	 List1.add("Ganesh");
	 List1.add("Murali");
	 ArrayList<String>List2=new ArrayList<>();
	 List2.add("Harita");
	 List1.addAll(List2);
     System.out.println(List1);
     
}

}
