package encapsulation;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account act = new Account();
		//act.balance; cannot access private member variable
		act.setBalance(10000f);
		act.name="raghu";
		act.email="raghu@gmail.com";
		act.mobile=9845547471l;
		act.info();

	}

}
