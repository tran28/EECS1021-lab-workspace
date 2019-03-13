package lab5_model;

public class TempWorker extends Worker
{
	
	public TempWorker(String id, String name)
	{
		super(id, name, "none");
	}

	@Override
	public boolean auth(String password)
	{
		return password.length() == 0;
	}
	
	public String toString()
	{
		return "Temp Worker " + this.getName() + " (ID=" + this.getId() + ")";
	}

	
}
