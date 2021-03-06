package oops;

import java.util.Random;

/**
 * Bank class representing banking functions like
 * openAccount,deposit,withdraw,checkBalance
 * @author lenovo
 *
 */
public class Bank {
	private String name;
	private String email;
	private long mobile;
	private String address;
	private int actno;
	private double balance;
	
	/**
	 * OpenAccount - creates an account
	 * @param name
	 * @param email
	 * @param mobile
	 * @param address
	 * @return
	 */
	public int openAccount(String name,String email,long mobile,String address) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.balance = 0;
	//	this.actno = 1;
		Random randNum = new Random();
		int randactno = randNum.nextInt(100);
		this.actno = randactno;
		
		return this.actno;
	}
	
	public double deposit(int actno,double amttodeposit) {
		return this.balance = this.balance + amttodeposit;	
	}
	
	public double withdraw(int actno,double amttowithdraw) {
		return this.balance = this.balance - amttowithdraw;	
	}
	
	public double checkBalance(int actno) {
		return this.balance;	
	}
	
	

}
