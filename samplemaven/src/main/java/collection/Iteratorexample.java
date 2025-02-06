package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("RED");
		s.add("GREEN");
		s.add("WHITE");
		s.add("BLACK");
		s.add("BLUE");
		Iterator it=s.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());

		}
		
		
		

	}

}
