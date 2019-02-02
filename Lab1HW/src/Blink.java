

import c4e.phidget.HardwareInterface;

public class Blink extends HardwareInterface
{
	//------------------------------------Attribute Section
	int counter = 0;
	private int pinNumber;
	private boolean pinState;
	private long timerDelay;
	
	//------------------------------------Constructor Section
	public Blink(boolean debug)
	{
		super(debug);
		this.pinNumber = 0;
		this.pinState = false;
		this.setOutputState(this.pinNumber, this.pinState);
		this.timerDelay = 1500;
		this.setTimer(this.timerDelay);
	}

	//------------------------------------Behaviour Section
	@Override
	public void timerCallback()
	{ 
		// Do not touch this line.
		this.setOutputState(this.pinNumber, this.pinState);
		
		// Your Task: Modify the two branching conditions.
		if((counter % 3) == 0 || (counter % 3) == 1) {
			this.pinState = true;
			System.out.println(counter);
		}
		else if((counter % 3) == 2) {
			this.pinState = false;
			System.out.println(counter);
		}
		counter++;
		// Do not touch this line.
		this.setTimer(this.timerDelay);
	}
	
}
