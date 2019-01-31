package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.qa.quickstart.Hospital.Team;
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
		System.out.println("Patient BloodType: ");
		String bloodTypeString = apScanner.nextLine();
		System.out.println("Patient Date Of Birth: ");
		String DOBString = apScanner.nextLine();
		System.out.println("Patient Name: ");
		String nameString = apScanner.nextLine();
		System.out.println("Patient NIN: ");
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
	public static void showInformation(List<Ward> wardList, List<Team> teams) { 
		System.out.println("\nList of Teams:\n\n"+teams.toString());
		System.out.println("\nList of Wards and Patients:\n\n"+wardList.toString());
		
	}

}
