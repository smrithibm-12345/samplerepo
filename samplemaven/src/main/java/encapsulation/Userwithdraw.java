package encapsulation;

public class Userwithdraw 
{
public void withdraw(int n)
{
	int amount=5000;
	if(n==1212)
	{
	System.out.println("Pin number has been matched successfully,please withdraw your amount from ATM ");
	System.out.println("you should withdraw amount as"+"  "+"Rs."+amount+"/-"+" "+"only");

	}
	else if(n==1001)
	{
		System.out.println("Pin number has been matched successfully,please withdraw your amount from ATM ");
		System.out.println("you should withdraw amount as"+"  "+"Rs."+amount+"/-"+" "+"only");

	}
	else if(n==1234)
	{
		System.out.println("Pin number has been matched successfully,please withdraw your amount from ATM ");
		System.out.println("you should withdraw amount as"+"  "+"Rs."+amount+"/-"+" "+"only");

	}
	else
	{
		System.out.println("Pin number is not matching ,Access denied.Please enter a valid Pin number");
		System.out.println("you should withdraw amount as"+"  "+"Rs."+amount+"/-"+" "+"only");

	}
	
}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Pinex obj=new Pinex();
		obj.setter(1212);
		int y=obj.getter();
		Userwithdraw obj1=new Userwithdraw();
		obj1.withdraw(y);

	}

}
