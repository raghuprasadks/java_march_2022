package exceptionmgmt;

import java.util.Scanner;

public class Exception_Unhandled_1 {

	public static void main(String args[]) {
		
		//scenario 1 - division by zero
		System.out.println("Enter a number");
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int result = 10/n;
		System.out.println("result "+result);
	}
}
