package oops;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SonyTV stv = new SonyTV();
		UniversalRemote ur = new SonyTV();
		UniversalRemote.greet();
		ur.on();
		ur.changeChannel("Sports Channel");
		ur.changeVolume(25);
		ur.off();
		
		ur=new AcerTV();
		ur.on();	
	}
}
