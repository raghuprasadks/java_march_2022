package oops;

public class SonyTV implements UniversalRemote{

	boolean status = false;
	String channel = "";
	@Override
	public void on() {
		// TODO Auto-generated method stub
		status = true;
		System.out.println("Sony TV : on : status "+status);
	}

	@Override
	public void changeChannel(String channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
		System.out.println("Sony TV : Current Channel"+this.channel);
	}

	@Override
	public void changeVolume(int vol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		this.status = false;
		System.out.println("Sony TV : Off status "+this.status);
	}

}
