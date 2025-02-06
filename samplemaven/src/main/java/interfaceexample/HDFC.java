package interfaceexample;
import java.util.Scanner;

public class HDFC implements RBI
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be deposit");
		double amount=sc.nextDouble();
		System.out.println("Enter the duration");
		int duration=sc.nextInt();
		RBI obj=new HDFC();
     obj.recurringdeposit( amount, duration);
		HDFC obj1=new HDFC();
	double finalamount= obj1.recurringdeposit(amount, duration);
		obj1.display(amount, duration,finalamount);

		

		

	}
	
	public void display(double amount,int duration,double finalamount)
	{
		System.out.println("**************************");
		System.out.println("Enter the amount to be deposit"+amount);
		System.out.println("Enter the duration"+duration+"months");
		System.out.println("Enter the interest rate"+interestrate+"%");
		System.out.println("Total amount after" + duration +" months: Rs." + finalamount);
        System.out.println("**************************");

	}
	@Override
	public double recurringdeposit(double amount, int duration) 
	{
		// TODO Auto-generated method stub
		double totalInterest = (amount * interestrate * duration) / (12 * 100); 
		System.out.println("Total interest is"+interestrate);
		  double finalamount= amount+totalInterest;
		  return finalamount;
	}

		




}
