package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes = new ArrayList<String>();
	
	// TO DO: Constructor that takes an IDcopy
	public Physician (Integer id) {
		this.id = id;
	}
	
   
	
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	 // TO DO: Implement HIPAACompliantUser!
	
	@Override
	public boolean assignPin(int pin) {
		if( pin < 999 || pin > 9999) {
			return false;
		}
		this.pin = pin;
		return true;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID != this.id) {
			return false;
		}
		return true;
	}




	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}




	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
    // TO DO: Setters & \
	
}
