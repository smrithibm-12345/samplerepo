package interfaceexample;

public class Multiplechild implements MultipleA,MultipleB
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Multiplechild obj=new Multiplechild();
		obj.draw();
	    obj.print();
	    obj.show();
		
	}
	public void draw()
	{
		System.out.println("HAI CHILD");

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("HAI PARENTA");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HAI PARENTB");

	}

}
