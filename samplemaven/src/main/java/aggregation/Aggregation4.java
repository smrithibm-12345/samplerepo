package aggregation;

public class Aggregation4 
{
	int mark2;
	int mark3;
	Aggregation3 ref;
	public Aggregation4(int mark2,int mark3,Aggregation3 ref)
	{
	this.mark2=mark2;
	this.mark3=mark3;
	this.ref=ref;
	
	}
	public void display()
	{
		
		System.out.println("Mark2:"+mark2);
		System.out.println("Mark3:"+mark3);
		System.out.println("Name:"+ref.studname+" "+"Mark:"+ref.mark);

	}
	


	public static void main(String[] args) 
	{
		Aggregation3 obj1=new Aggregation3("Athira",60);
		Aggregation4 obj=new Aggregation4(30,50,obj1);
		obj.display();
		

	}

}
