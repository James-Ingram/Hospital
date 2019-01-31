package com.qa.quickstart.Hospital;

import java.util.Date;

public class Patient extends Stakeholder {
	private int patientID;
	private String doctor, ailment, pastTreatments, bloodType;

	public Patient(String bloodType, Date DOB, String name, String NIN) {

		super(name, DOB, NIN);
		this.bloodType = bloodType;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getAilment() {
		return ailment;
	}

	public void setAilment(String ailment) {
		this.ailment = ailment;
	}

	public String getPastTreatments() {
		return pastTreatments;
	}

	public void setPastTreatments(String pastTreatments) {
		this.pastTreatments = pastTreatments;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
}
