package exceptionhandling;

public class Throwex 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int age=12;
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
		}

	}

}
