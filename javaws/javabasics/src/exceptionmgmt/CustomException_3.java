package exceptionmgmt;

import java.util.Scanner;

public class CustomException_3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scnr.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally block is executed");
		}
	}

	public static void validateAge(int age) throws InvalidAge{
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			throw new InvalidAge("Invalid age");
		}
		
	}

}
