package abstraction;

public class Abstract2 extends Abstraction1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Abstract2 obj1=new Abstract2();//object creation
		Abstraction1 obj=new Abstract2();//reference creation
		obj1.display();
		obj.show();
		obj1.print();

	}
	public void print()
	{
		System.out.println("HELLO");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int a=10;int b=15;
		int c;
		c=a+b;
		System.out.println(c);
		
	}

}
