package oops;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbiabc = new SBI();
		double interest;
		interest = rbiabc.calculateInterest(10000, rbiabc.rateOfInterest(), 1);
		System.out.println("SBI Interest "+interest);
		rbiabc = new HDFC();
		interest = rbiabc.calculateInterest(10000, rbiabc.rateOfInterest(), 1);
		System.out.println("HDFC Interest "+interest);
		

	}

}
