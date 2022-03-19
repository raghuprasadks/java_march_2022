package encapsulation;

public class Account {
	
	public String name;
	String email; //default
	protected long mobile;
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void info() {
		System.out.println("Name "+this.name + " email "+this.email +" mobile :"+this.mobile + "Balance : "+this.balance);
	}

}
