package CTSdemo;
import java.util.ArrayList;
public class CLone {
	public static void main(String[] args)
	{
		ArrayList<String>List1=new ArrayList<>();
		List1.add("Taruni");
		List1.add("Tejaswini");
		List1.add("Kalyan");
		System.out.println("First arraylist:"+List1);
		ArrayList<String>List2=(ArrayList<String>)List1.clone();
		System.out.println(List2);
		
	}

}
