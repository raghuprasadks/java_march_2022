package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList_1 {
	public static void main(String[] args) {
		// adding elements to list
		//ArrayList fruitlist = new ArrayList();
		//generics
		//ArrayList<String> fruitlist = new ArrayList<String>();
		List<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Guava");
		System.out.println("Looping ");
		Iterator<String> itr = fruitlist.iterator();
		while(itr.hasNext()) {
			// type casting
			//String fruit = (String)itr.next();
			String fruit = itr.next();
			System.out.println(fruit);			
		}		
		String elem1 = (String)fruitlist.get(1);
		System.out.println("Element at 1st index");
		fruitlist.set(1, "Mango");
		fruitlist.remove(0);
		System.out.println("Looping - after update and delete");
		Iterator itr1 = fruitlist.iterator();
		while(itr1.hasNext()) {
			// type casting
			String fruit = (String)itr1.next();
			System.out.println(fruit);			
		}		
	}
}
