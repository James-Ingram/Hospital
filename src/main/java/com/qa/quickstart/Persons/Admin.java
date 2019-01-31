package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.List;

public class Admin extends Employee {

	private String title, accessLevel;
	public Admin(String name, String DOB, String NIN, String accessLevel, String title) {
		super(name, DOB, NIN);
		this.title = title;
		this.accessLevel= accessLevel;
	}
	
	public static Patient admitPatient()
	{
		Patient patient = new Patient("","","","");
		patient.setBloodType("A-");
		patient.setDOB("1997/05/11");
		patient.setName("James Ingram");
		patient.setNIN("PB969162");
		return patient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

}
