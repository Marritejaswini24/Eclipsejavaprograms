package CTSdemo;

import java.util.ArrayList;

public class Removeif {
	public static void main(String[] args)
	{
		ArrayList<Integer>List1=new ArrayList<>();
		List1.add(1);
		List1.add(2);
		List1.add(3);
		List1.add(4);
		List1.add(5);
		List1.removeIf(List->List%2==0);
        System.out.println(List1);
}

}
