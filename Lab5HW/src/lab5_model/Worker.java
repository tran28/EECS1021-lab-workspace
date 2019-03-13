package lab5_model;

public class Worker
{
	private String id;
	private String name;
	private String password;

	public Worker(String id, String name, String password)
	{
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}

	public boolean auth(String password)
	{
		return password.equals(this.password);
	}

	public String toString()
	{
		return "Worker " + this.getName() + " (ID=" + this.getId() + ")";
	}

}
