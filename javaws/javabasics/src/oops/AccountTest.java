package oops;

import encapsulation.Account;

public class AccountTest extends Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account act = new Account();
		//act.balance; cannot access private member variable
		act.name="raghu";
		//act.email="raghu@gmail.com"; cannot be accesssed outside the package
		
		//act.mobile=9845547471l;
		
		act.info();
		
		AccountTest actTest = new AccountTest();
		actTest.name = "ravi";
		//actTest.email="ravi@gmail.com";
		actTest.mobile=9393939393l;
	}

}
