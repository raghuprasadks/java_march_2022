package oops;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vhl = new Vehicle();
		vhl.start();
		
		Bike myBike = new Bike();
		myBike.start();
		myBike.move();
		myBike.move();
		myBike.stop();
		
		Car myCar = new Car();
		myCar.start();
		myCar.move();
		myCar.info();
		
		
		

	}

}
