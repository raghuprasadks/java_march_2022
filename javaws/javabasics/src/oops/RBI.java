package oops;

public abstract class RBI {
	
	public abstract float rateOfInterest();

	public double calculateInterest(double p,double roi,int time) {
		return p*roi*time/100;
	}
}
