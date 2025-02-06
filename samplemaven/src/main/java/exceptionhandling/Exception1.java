package exceptionhandling;

public class Exception1 
{
	public static void main(String[] args) 
	{
	int a=10;
	int b=0;
	try
	{
	int c=a/b;
	System.out.println(c);

	}
	catch(ArithmeticException e)
	{
		b=2;
		int c=a/b;
		System.out.println("Exception occured is:"+e);
		System.out.println("So result is"+c);



	}
	finally 
	{
		int d=20;
		int e=5;
		int f=d/e;
		System.out.println(f);

		System.out.println("Given result is provided by catch block");

	}
	
	
	}


}

