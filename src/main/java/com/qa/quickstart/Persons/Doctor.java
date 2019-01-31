package com.qa.quickstart.Persons;

import java.util.Date;

public class Doctor extends MedicalStaff {

	
	private boolean isConsultant;

	public Doctor(String speciality, int grade, boolean isConsultant, Date DOB, String name, String NIN) {
		super(name, DOB, NIN, speciality, grade );
		this.isConsultant = isConsultant;
	}

	public boolean isConsultant() {
		return isConsultant;
	}

	public void setConsultant(boolean isConsultant) {
		this.isConsultant = isConsultant;
	}
}