package oops;

public class Car extends Vehicle{
	
	String ac="";
	
	//override
		public void start() {
			System.out.println("Car:start:Button start ");
			speed = 0;
		}
		
		public void move() {
			
			speed = speed + 25;
			System.out.println("Car:move "+speed);
		}
		
		public void info() {
			color="Red";
			ac="Voltas";
			number="KA MN 05  6677";
			
			System.out.println("Color "+color + " AC "+ac);
		}

}
