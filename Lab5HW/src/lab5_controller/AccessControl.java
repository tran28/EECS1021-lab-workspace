package lab5_controller;

import c4e.phidget.Event;
import c4e.phidget.HardwareInterface;
import lab5_model.DataCollections;
import lab5_model.RFIDTag;
import lab5_model.Worker;

import java.awt.Font;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AccessControl extends HardwareInterface {

	// ------------------------------------Attributes
	DataCollections dc;
	boolean debugStatus;

	// ------------------------------------Constructor
	public AccessControl(boolean debug) {
		super(debug);
		this.dc = new DataCollections();
		this.setTimer(1000);
		this.debugStatus = debug;
		UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 48));
		UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 36));
	}

	// ------------------------------------Timer
	@Override
	public void timerCallback() {
		this.setAntennaOn(true);
		this.setLED(true);
		this.setOutputState(0, false);
		this.setOutputState(1, false);
		JOptionPane.showMessageDialog(null, "RFID Access Control Started");
	}

	/// *************************************************************************************

	// ------------------------------------RFID Tag
	@Override
	public void tagLost(Event event) {
		if(!debugStatus) {
			Map<String, RFIDTag> tags = dc.getTagsCollection();
			String tagId = event.getTag(); // get the tag ID from the fired event**
			RFIDTag tag = tags.get(tagId); // try to find this tag in the tags collection*
			if (tag != null) {
				Worker holder = tag.getHolder(); // find the worker who holds this tag*
				String password = JOptionPane.showInputDialog(null, "Enter Password", "");
				if (holder.auth(password)) {
					this.setOutputState(1, true); // turn the green LED on*
					JOptionPane.showMessageDialog(null, "Hello " + holder.getName());
				} else {
					this.setOutputState(0, true); // turn the red LD on*
					JOptionPane.showMessageDialog(null, "Unauthorized access attempt!");
				}
				// remember that this tag has been seen at this time (Part C)*
			} else {
				JOptionPane.showMessageDialog(null, "Unrecognized tag " + tagId);
			}
			// turn off the board's LED**
			this.setLED(false);
			// turn off both green and red LEDs
			this.setOutputState(0, false);
			this.setOutputState(1, false);
			// ask the user (using JOptionPane) if they like to continue (default should be
			// yes)
			int answer = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Exit?",
					JOptionPane.YES_NO_OPTION);
			if (answer == JOptionPane.NO_OPTION)// (they don't want to continue)
			{
				this.log();
				JOptionPane.showMessageDialog(null, "RFID Access Control Shutdown");
				System.exit(0);
			}
			// turn on the board's LED
			this.setLED(true);
		}
	}

	// ************************************************************************************/*

	private void log() {
		Map<String, RFIDTag> tags = dc.getTagsCollection();
		// go thru every tag in the collection and output its toString()
		for (Entry<String, RFIDTag> entry : tags.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
	}

}
