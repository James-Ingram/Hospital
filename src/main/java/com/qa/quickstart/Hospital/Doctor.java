package com.qa.quickstart.Hospital;

public class Doctor //extends Stakeholder 
{

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
	private String speciality;
	private int grade;
	private boolean isConsultant;
	public Doctor() {
		
	}

}
