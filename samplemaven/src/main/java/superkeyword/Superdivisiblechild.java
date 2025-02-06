klpackage superkeyword;

public class Superdivisiblechild extends Superdivisible 
{
public void divisible()
{
	int c;
	c=super.display(10,10);
	
   if(c%10==0)
   {
	   System.out.println("Number is divisible by 10");
   }
   else
   {
	   System.out.println("Number is not divisible by 10");

   }
}
	public static void main(String[] args) 
	{
		Superdivisiblechild obj=new Superdivisiblechild();
		obj.divisible();

	}

}
