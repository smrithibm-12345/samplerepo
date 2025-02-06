package polymorphism;

public class Onseason
{

	int orgprize;
		
	public void discount(int orgprize)
	{
		this.orgprize=orgprize;

		double discount=orgprize*0.40;
		System.out.println("Discount of onseason:"+discount);
		
	}

}
