package oops;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank myBank = new Bank();
		int actno;
		double balance;
		actno = myBank.openAccount("raghu", "raghu@gmail.com", 9845547471l, "Jakkuru,Bengaluru");
		System.out.println("Account number "+actno);
		balance =myBank.deposit(actno, 10000);
		System.out.println("Balance after deposit of 10K " +balance);
		balance =myBank.deposit(actno, 15000);
		System.out.println("Balance after deposit of 15K " +balance);
		balance =myBank.withdraw(actno, 5000);
		System.out.println("Balance after withdraw of 5K " +balance);
		balance =myBank.checkBalance(actno);
		System.out.println("check Balance" +balance);
		
	}

}
