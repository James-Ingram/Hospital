package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.Scanner;

public class Doctor extends MedicalStaff {

	
	private boolean isConsultant;

	public Doctor(String speciality, int grade, boolean isConsultant, String DOB, String name, String NIN) {
		super(name, DOB, NIN, speciality, grade );
		this.isConsultant = isConsultant;
	}
	public static void addTreatment(Patient patient)
	{
		System.out.println("What is the treatment? ");
		Scanner doctorScanner = new Scanner(System.in);
		String doctorString = doctorScanner.nextLine();	
		patient.setTreatment(doctorString);
	}

	public boolean isConsultant() {
		return isConsultant;
	}

	public void setConsultant(boolean isConsultant) {
		this.isConsultant = isConsultant;
	}
}