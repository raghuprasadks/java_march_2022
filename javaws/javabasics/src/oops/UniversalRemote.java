package oops;

public interface UniversalRemote {

	public static String intr="Interface";
	public void on();
	public void changeChannel(String channel);
	public void changeVolume(int vol);
	public void off();
	
	public static void greet() {
		System.out.println("Welcome to Universal Remote");
	}
	
}
