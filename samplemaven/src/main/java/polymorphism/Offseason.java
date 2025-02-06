package polymorphism;

public class Offseason extends Onseason
{
	int orgprize;
	
	public void discount(int orgprize)
	{
		this.orgprize=orgprize;
		double discount=orgprize*0.15;
		System.out.println("Discount of offseason:"+discount);

		super.discount(100);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Offseason obj=new Offseason();
		obj.discount(200);
	}

}
