

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;

	// TO DO: Constructor that takes an IDcopy
	public Physician(int id) {
		setId(id);
	}
	
    // TO DO: Implement HIPAACompliantUser!
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin >= 1000 && pin < 10000) {
			this.pin = pin;
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID == id) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
    // TO DO: Setters & Getters
	
	public void setPatientNotes(String note) {
		patientNotes.add(note);
	}
	
	public ArrayList<String> getPatientNotes(){
		return patientNotes;
	}
}
