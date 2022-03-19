package oops;
public class Accounts {
	String name;
	String email;
	long mobile;
	long aadhar;
	// constructor 1
	public Accounts(String name,String email,long mobile) {
		System.out.println("Accounts : Constructor 1");
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	// constructor 2
	public Accounts(String name,String email,long mobile,long aadhar) {
		System.out.println("Accounts : Constructor 2");
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.aadhar = aadhar;
	}
	public Accounts() {
		System.out.println("Default constuctor");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts myAct = new Accounts("Rajesh","rajesh@gmail.com",9393939339l);
		Accounts otherAct = new Accounts("Ramya","ramya@gmail.com",9393939338l,38838338);
		Accounts defaultAct = new Accounts();
		defaultAct.name="Satvik";		
	}
}
