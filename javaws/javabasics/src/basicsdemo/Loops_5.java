package basicsdemo;

import java.util.Scanner;
public class Loops_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("While loop - print 1's table");
		int start =1;
		int end = 10;
		while (start <=end) {
			System.out.println(start);
			//start = start +1;
			start +=1;
		}
		System.out.println("For loop - print 2's table");
		for (int i=2;i<=20;i=i+2) {
			System.out.println(i);
		}
	// print 5 's table in reverse - while loop
	// print any table int table = 6;
	System.out.println("print any table");
	int table = 7;
	for (int i=table;i<=table*10;i=i+table) {
		System.out.println(i);
	}
	System.out.println("print any table using scanner");
	Scanner scrn = new Scanner(System.in);
	int tablenew = scrn.nextInt();
	for (int i=tablenew;i<=tablenew*10;i=i+tablenew) {
		System.out.println(i);
	}
	System.out.println("Break");
	for (int k=5;k<=50;k=k+5) {
		if (k==25)
			break;
		System.out.println(k);		
	}
	System.out.println("Continue");
	for (int k=5;k<=50;k=k+5) {
		if (k==25)
			continue;
		System.out.println(k);		
	}
}}
