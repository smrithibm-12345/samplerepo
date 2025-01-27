package superkeyword;

public class Supervariablechild extends Supervariable
{
	String color="red";
	public void display() {
		System.out.println(color);
	System.out.println(super.color);
	
	}

	public static void main(String[] args) 
	{
		Supervariablechild obj=new Supervariablechild();
		obj.display();

	}

}
