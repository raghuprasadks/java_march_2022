package oops;

public class Bike extends Vehicle{
//public class Bike{

	//override
	public void start() {
		System.out.println("Bike:start:Button start ");
		speed = 0;
	}
	
	//move
	public void move() {
		
		speed = speed + 15;
		System.out.println("Bike:move "+speed);
	}
}
