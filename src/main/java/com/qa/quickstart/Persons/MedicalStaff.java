package com.qa.quickstart.Persons;

import java.util.Date;

public class MedicalStaff extends Employee {
	private String speciality;
	private int grade;
	public MedicalStaff(String name, Date DOB, String NIN, String speciality, int grade) {
		super(name, DOB, NIN);
		this.grade = grade;
		this.speciality = speciality;

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

}
