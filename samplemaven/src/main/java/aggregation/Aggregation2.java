package aggregation;

public class Aggregation2
{
	String city;
	String state;
	Aggregation1 ref;//ref variable created ,data type is class name of a parent//aggregation

public Aggregation2(String city,String state,Aggregation1 ref) 
{
	this.city=city;
	this.state=state;
	this.ref=ref;
}
public void display()
{
	
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address);//aggragation we can print two properities no need to print full properties
	System.out.println(city+" "+state);

}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Aggregation1 obj1=new Aggregation1("Athira",23,"ABCD");
		Aggregation2 obj2=new Aggregation2("TVM","kerala",obj1);
		obj2.display();
		
	}

}
