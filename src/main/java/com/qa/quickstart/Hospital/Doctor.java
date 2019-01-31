package com.qa.quickstart.Hospital;

import java.util.Date;

public class Doctor extends Stakeholder {

	private String speciality;
	private int grade;
	private boolean isConsultant;

	public Doctor(String speciality, int grade, boolean isConsultant, Date DOB, String name, String NIN) {
		super(name, DOB, NIN);
		this.speciality = speciality;
		this.grade = grade;
		this.isConsultant = isConsultant;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public boolean isConsultant() {
		return isConsultant;
	}

	public void setConsultant(boolean isConsultant) {
		this.isConsultant = isConsultant;
	}
}