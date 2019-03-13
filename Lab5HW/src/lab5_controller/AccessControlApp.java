package lab5_controller;

public class AccessControlApp
{
	public static void main(String[] args)
	{
		boolean debug = false; // turn this to true to test LEDs then REVERT to false
		AccessControl ac = new AccessControl(debug);
		ac.startMonitoring();
	}
}
