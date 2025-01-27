package superkeyword;

public class Superconstructorchild extends Superconstructor 
{
	public Superconstructorchild() 
	{
		super(5,6);
		System.out.println("Child class");

	}

	public static void main(String[] args) 
	{
		Superconstructorchild obj=new Superconstructorchild();

	}

}
