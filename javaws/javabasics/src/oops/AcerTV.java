package oops;

public class AcerTV implements UniversalRemote{
	
	boolean status = false;
	String channel = "";
	@Override
	public void on() {
		// TODO Auto-generated method stub
		status = true;
		System.out.println("AcerTV : on : status "+status);
	}

	@Override
	public void changeChannel(String channel) {
		// TODO Auto-generated method stub
		this.channel=channel;
		System.out.println("AcerTV : Current Channel"+this.channel);
	}

	@Override
	public void changeVolume(int vol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		this.status = false;
		System.out.println("AcerTV : Off status "+this.status);
	}


}
