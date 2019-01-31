package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.qa.quickstart.Hospital.Ward; 
//import com.qa.quickstart.Hospital.Team;

public class Admin extends Employee {

	private String title, accessLevel;

	public Admin(String name, String DOB, String NIN, String accessLevel, String title) {
		super(name, DOB, NIN);
		this.title = title;
		this.accessLevel = accessLevel;
	}

	public static Patient admitPatient() {
		Patient patient = new Patient("", "", "", "");
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
	
//	these are the  , List<Team> teams
	public void promoteDoctor(List<Doctor> doctors) { 
		Scanner pdScanner = new Scanner(System.in); 
		String doctorNameString = pdScanner.nextLine(); 
		int doctorPromotion = pdScanner.nextInt();
		int doctorIndex = 0;
		for(int i = 0 ; i < doctors.size(); i++) { 
			if(doctorNameString == doctors.get(i).getName()) {
				doctorIndex = i;
			} 
			else { 
				
			} 
			 
		} 
		doctors.get(doctorIndex).setGrade(doctorPromotion);
	}
	public void showInformation(List<Ward> wardList) { 
		Ward.toString(wardList); 
		
	}

}
