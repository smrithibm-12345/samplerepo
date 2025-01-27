package accessmodifiers;

public class Accessmodifierex1 {

	public static void main(String[] args) 
	{
      Accessmodifierex1 obj5=new Accessmodifierex1();
      obj5.display5();
      obj5.display6();
      obj5.display7();
      obj5.display8();
	}
	public void display5() 
	{
		System.out.println("HELLO");
	}
	private void display6() 
	{
		System.out.println("HELLO world");
	}
	protected void display7() 
	{
		System.out.println("HELLO smrithi");
	}
	 void display8() 
	{
		System.out.println("HELLO sruthi");
	}

}
