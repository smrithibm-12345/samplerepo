package superkeyword;

public class Supermethodchild extends Supermethod 
{
public void display() 
{
	System.out.println("Child class");
	//System.out.println(super.display());
	super.display();


}
	public static void main(String[] args) {
		
		Supermethodchild obj=new Supermethodchild();
		obj.display();

	}

}
