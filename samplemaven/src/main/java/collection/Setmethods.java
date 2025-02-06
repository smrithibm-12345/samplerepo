package collection;

import java.util.HashSet;
import java.util.Set;

public class Setmethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Set<String> s=new HashSet<String>();
    s.add("BLUE");
    s.add("Pink");
    s.add("White");
    System.out.println(s);
    Set<String> s1=new HashSet<String>();
    s1.add("RED");
    s1.add("Green");
    s.addAll(s1);
    System.out.println(s);
    System.out.println(s.contains("White"));
    System.out.println(s.containsAll(s1));
    System.out.println(s.isEmpty());
    s.remove("Green");
    System.out.println(s);
    s.removeAll(s1);
    System.out.println(s);
    System.out.println( s.size());

    
    
	}

}
