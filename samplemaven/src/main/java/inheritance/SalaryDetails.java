package inheritance;

public class SalaryDetails extends Employee {
	
	     double hra;
	     double pf;

	 
	    public void calculateHraAndPf() {
	        hra = 0.05 * basicPay;
	        pf = 0.20 * basicPay; 
	    }
	}

