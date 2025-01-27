package polymorphism;

public class Polymorphism2 extends Polimorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism2 obj=new Polymorphism2();
		obj.display(2,4);
	

	}
	public void display(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		super.display(3,6);
		
	}

}
