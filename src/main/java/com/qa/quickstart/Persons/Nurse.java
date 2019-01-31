package com.qa.quickstart.Persons;

import java.util.Date;
import java.util.Scanner;

public class Nurse extends MedicalStaff {

	public Nurse(String name, String DOB, String NIN, String speciality, int grade) {
		super(name, DOB, NIN, speciality, grade );
		}
	
	public static void lookUpTreatment(Patient patient)
	{
		System.out.println("Treatment: " + patient.getTreatment());
	}


}
