package inheritance;

public class SalarySlip extends SalaryDetails
{
	
	    double totalSalary;

	    public void calculateTotalSalary() 
	    {
	        totalSalary = basicPay + hra - pf - deduction + bonus;
	    }

	    public void printSalarySlip() 
	    {
	        System.out.println("\nSalary Slip:");
	        System.out.println("------------------------");
	        System.out.println("Basic Pay: " + basicPay);
	        System.out.println("Deduction: " + deduction);
	        System.out.println("HRA (5% of Basic): " + hra);
	        System.out.println("PF (20% of Basic): " + pf);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + totalSalary);
	        System.out.println("------------------------");
	    }


	    public static void main(String[] args) 
	    {
	       
	        SalarySlip obj= new SalarySlip();
	        obj.getInput();
	 
	        obj.calculateHraAndPf();
	        obj.calculateTotalSalary();
	        obj.printSalarySlip();
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
