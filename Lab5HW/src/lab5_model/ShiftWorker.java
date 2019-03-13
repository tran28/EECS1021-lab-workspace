package lab5_model;

import java.util.Calendar;

public class ShiftWorker extends Worker
{
	private int shiftStart;
	private int shiftEnd;
	
	public ShiftWorker(String id, String name, String password, String shift)
	{
		super(id, name, password);
		String[] parts = shift.split("-");
		this.shiftStart = Integer.parseInt(parts[0]);
		this.shiftEnd = Integer.parseInt(parts[1]);

	}

	@Override
	public boolean auth(String password)
	{
		Calendar now = Calendar.getInstance();
		int second = now.get(Calendar.SECOND);
		// simulate hour by second
		//System.out.printf("second=%d, shiftStart=%d, shiftEnd=%d\n",second,this.shiftStart,this.shiftEnd);
		return (second >= shiftStart) && (second <= shiftEnd) && super.auth(password);
	}
	
	public String toString()
	{
		return "Shift Worker " + this.getName() + " (ID=" + this.getId() + ", Shift=" + this.shiftStart + "-" + this.shiftEnd + ")";
	}

	
}
