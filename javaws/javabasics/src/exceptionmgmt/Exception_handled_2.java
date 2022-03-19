package exceptionmgmt;

import java.util.Scanner;

public class Exception_handled_2 {
	public static void main(String[] args) {
		//scenario 1 - division by zero
		System.out.println("Enter a number");
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int result=0;
		try {
			result = 10/n;
		}catch(Exception oException) {
			System.out.println("Exception "+oException);
		}finally {
			System.out.println("Finally ");
		}
		System.out.println("result "+result);
	}
}
