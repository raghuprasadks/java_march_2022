package basicsdemo;

import java.util.Scanner;

public class Array_assignment_7 {
	public static void main(String[] args) {
		System.out.println("Enter total number of items to purchase");
		Scanner scnr = new Scanner(System.in);
		int totalitems = scnr.nextInt();
		int items[] = new int[totalitems];		
		for (int i=0;i<items.length;i++)
		{
			System.out.println("Enter item price");
			int price = scnr.nextInt();
			items[i]=price;			
		}		
		System.out.println("Price list of items purchased ");
		for (int item:items) {
			System.out.println(item);
		}		
		int total=0;
		int max = items[0];
		int min = items[0];
		float avg=0;
		int pricesgt50[] = new int[totalitems];
		for (int i=0;i<items.length;i++)
		{			
			total += items[i];			
			if (items[i]>max)
				max = items[i];			
			if(items[i]<min)
				min=items[i];
			if (items[i]>50)
				pricesgt50[i]=items[i];
		}
		System.out.println("Total "+total);
		System.out.println("max "+max);
		avg=total/items.length;
		System.out.println("Average price "+avg);		
	}		


}
