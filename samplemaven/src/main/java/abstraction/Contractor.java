package abstraction;
import java.util.Scanner;

public class Contractor extends Employee1
{
	
	public static void main(String[] args)
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the totalpayment");
	int totalpayment=sc.nextInt();
	System.out.println("Enter the Workinghour");
	int workinghour=sc.nextInt();
		Employee1 obj1=new Contractor(totalpayment,workinghour);
		obj1.calculateSalary();
		Contractor obj=new Contractor(totalpayment,workinghour);
		obj.Fulltimeemployee();
		
	
		

	}
int totalpayment;
int workinghour;
public Contractor(int totalpayment,int workinghour)
{
	this.workinghour=workinghour;
	this.totalpayment=totalpayment;
}
public void Fulltimeemployee()
{
	
	int workinghour=8;
	
	 int paymenthour=totalpayment/workinghour;
	System.out.println("Total payment per fulltime employee working hour is"+paymenthour);
	

	
}

	
	@Override
	public void calculateSalary() 
	{
		// TODO Auto-generated method stub
		this.totalpayment=totalpayment;
		this.workinghour=workinghour;
		// TODO Auto-generated method stub
		int paymenthour=totalpayment/workinghour;
		System.out.println("Total payment per working hour is"+paymenthour);

		
	}




}

