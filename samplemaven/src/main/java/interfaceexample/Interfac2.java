package interfaceexample;

public class Interfac2 implements Interface1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interface1 obj1=new Interfac2();//reference creation
		obj1.display();
Interfac2 obj=new Interfac2();//object creation
obj.display();
obj.show();

	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("HAI");
		
	}
	public void show()
	{
		System.out.println("HAI World");

	}

}
