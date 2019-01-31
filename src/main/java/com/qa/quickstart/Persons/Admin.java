package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
		Scanner apScanner = new Scanner(System.in);
		String bloodTypeString = apScanner.nextLine();	 
		String DOBString = apScanner.nextLine(); 
		String nameString = apScanner.nextLine();
		String NINString = apScanner.nextLine();
		patient.setBloodType(bloodTypeString); 
		patient.setDOB(DOBString);  
		patient.setName(nameString);  
		patient.setNIN(NINString); 
		
		
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
