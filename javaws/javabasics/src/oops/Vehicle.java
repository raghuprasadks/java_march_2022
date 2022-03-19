package oops;

public class Vehicle {
	
	// Attributes/Properties
	
	String number;
	String color;
	double price;
	int speed;
	
	public void start() {
		speed =0;
		System.out.println("Vehicle : Kick : Started");
	}
	
	public void move() {
		speed =speed +5;
		System.out.println("Vehicle : move "+speed);
	}
	
	public void stop() {
		speed =0;
		System.out.println("Vehicle : stopped "+speed);
	}
}


