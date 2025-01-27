package inheritance;

public class Multilevelchild extends MultilevelparentB
{

	public static void main(String[] args) {
		Multilevelchild obj2=new Multilevelchild();
		obj2.display();
		obj2.display1();
		obj2.display2();
		// TODO Auto-generated method stub

	}
	public void display2()
	{
		System.out.println("Child class");
	}

}
