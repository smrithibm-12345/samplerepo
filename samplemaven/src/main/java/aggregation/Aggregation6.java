package aggregation;

public class Aggregation6
{
	String address;
	Aggregation5 ref;

	
	public Aggregation6(String address,Aggregation5 ref)
	{
		this.address=address;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println("Name:"+ref.name+" "+"rollno:"+ref.rollno);
		System.out.println("Address:"+" "+address);
		 
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
       Aggregation5 obj=new Aggregation5("AMMU",20);
       Aggregation6 obj1=new Aggregation6("ABCDEFG",obj);
    		   obj1.display();

	}

}
