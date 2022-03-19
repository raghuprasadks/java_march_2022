package basicsdemo;
import java.util.Scanner;
public class Array_6 {
	public static void main(String[] args) {
		// Define and initialize
		int marks[]= {21,22,25,18,17};
		// Loop
		System.out.println("Elements in the array");
		for (int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("Update ::");
		marks[4]=19; 
		for (int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		//marks[5]=20; error array index out of bounds
		//System.out.println(marks[5]);
		System.out.println("String array");
		String fruits[] = {"Apple","Banana","Guava","Mango"};
		for (String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("Total of marks array");
		int sum=0;
		for (int m:marks) {
			sum = sum +m;
		}
		System.out.println("Sum is "+sum);
		System.out.println("Searching ");
		int search=10;
		boolean isFound=false;
		for (int m:marks) {
			if (m==search)
				isFound = true;
		}		
		if(isFound) 
			System.out.println(search+ " is found");
		else
			System.out.println(search+ " is not found");
		System.out.println("Enter number of players");
		Scanner scnr = new Scanner(System.in);
		int numplayers = scnr.nextInt();
		//int runs[] = new int[5];
		int runs[] = new int[numplayers];		
		//for (int r:runs)
		for (int i=0;i<runs.length;i++)
		{
			System.out.println("Enter runs");
			int run = scnr.nextInt();
			runs[i]=run;			
		}		
		System.out.println("Runs ");
		for (int r:runs) {
			System.out.println(r);
		}
	}		
	}


