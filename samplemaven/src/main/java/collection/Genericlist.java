package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericlist 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("BLUE");
		s.add("RED");
		s.add("BLACK");
		s.add("GREEN");
		s.add("PINK");
		s.add("YELLOW");
		s.add("BLACK");
		System.out.println(s);
		s.set(1, "WHITE");
		System.out.println(s);
		System.out.println(s.get(2));
		System.out.println(s.indexOf("BLACK"));
		System.out.println(s.lastIndexOf("BLACK"));
		s.remove(6);
		System.out.println(s);
		System.out.println(s.contains("BLUE"));

		



		



	}

}
