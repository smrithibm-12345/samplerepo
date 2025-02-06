package encapsulation;

public class Pinex 
{
	private int pinno;
	public void setter(int pinno)
	{
		this.pinno=pinno;
	
	}
	public int getter()
	{
		System.out.println("Pin number:"+pinno);
		return pinno;
		
	}
	

}
