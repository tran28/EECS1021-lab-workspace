package lab5_model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataCollections
{
	private Map<String, Worker> workers;
	private Map<String, RFIDTag> tags;

	public DataCollections()
	{
		this.populate();
	}

	public Map<String, Worker> getWorkersCollection()
	{
		return this.workers;
	}

	public Map<String, RFIDTag> getTagsCollection()
	{
		return this.tags;
	}

	@SuppressWarnings("resource")
	private void populate()
	{
		this.workers = new HashMap<String, Worker>();
		this.tags = new HashMap<String, RFIDTag>();
		int record = 0;
		try
		{
			Scanner in = new Scanner(new File("dataStore/workers.txt"));
			while (in.hasNextLine())
			{
				record++;
				Worker worker;
				String[] field = in.nextLine().split(",");
				
				/* Your Task 
				 * Depending on the number of fields in the current line,
				 * create a new object of TempWorker, Worker, or ShiftWorker accordingly.
				 */
				// Do not modify the line below!!!
				worker = new TempWorker("", ""); // Default value for worker, which will be re-assigned later.
				// Do not modify the line above!!!
				
				// Your code starts here:
				if(field.length == 2) {
					worker = new TempWorker("85902", "Eve Powers");
				}
				else if(field.length == 3) {
					worker = new Worker("32015", "Jim Howard", "jimh");
				}
				else {
					worker = new ShiftWorker("73320", "Adam York", "adamy", "2-23");
				}

				// Do not touch this line
				// Once the worker object is created, store it in the database.
				this.workers.put(field[0], worker);
			}
			in.close();
			in = new Scanner(new File("dataStore/tags.txt"));
			record = 0;
			while (in.hasNextLine())
			{
				record++;
				String[] field = in.nextLine().split(",");
				if (field.length != 2) throw new RuntimeException("Wrong number of tag fields in record#" + record);
				Worker worker = this.workers.get(field[1]);
				if (worker == null) throw new RuntimeException("No such worker in tag record#" + record);
				RFIDTag tag = new RFIDTag(field[0], worker);
				this.tags.put(field[0], tag);
			}
			in.close();
		} catch (Exception e)
		{
			System.out.println("Error while processing record#" + record);
			e.printStackTrace();
			System.exit(1);
		}
	}
}
