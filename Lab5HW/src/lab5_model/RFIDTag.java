package lab5_model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RFIDTag
{
	private String id;
	private Worker holder;
	private String lastSeen;
	
	public RFIDTag(String id, Worker holder)
	{
		this.id = id;
		this.holder = holder;
		this.lastSeen = "*never seen before*";
	}

	public String getId()
	{
		return this.id;
	}

	public Worker getHolder()
	{
		return this.holder;
	}
	
	public void setLastSeen(Date lastSeen)
	{
		this.lastSeen = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss").format(lastSeen);
	}

	public String toString()
	{
		return "Tag " + this.getId() + ", Last Seen: " + this.lastSeen +", Holder: " + this.holder;
	}
}
