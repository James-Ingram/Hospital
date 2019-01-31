package com.qa.quickstart.Hospital;

import java.util.ArrayList;
import java.util.List;

import com.qa.quickstart.Persons.*;

public class Filler {

	public  Filler() {

	}
	public static List<Doctor> doctorFiller(){
		List<Doctor> doctors = new ArrayList<>();
	Doctor grey = new Doctor("General Surgery", 2, false, "1978/08/13", "Meredith Grey", "PJ13424N");
	Doctor sheperd = new Doctor("Neuro", 4, true, "1980/02/14", "Derek Sheperd", "P12312P");
	Doctor sloan = new Doctor("Plastics",3, false, "1972/10/24", "Mark Sloan", "P314124P");
	Doctor bailey = new Doctor("General Surgery", 3, true, "1978/04/05", "Miranda Bailey", "PS12312D");
	Doctor avery = new Doctor("Plastics", 1, true, "1978/08/13", "Jackson Avery", "PJ13684N");
	doctors.set(0,grey);
	doctors.set(1, sheperd);
	doctors.set(2, sloan);
	doctors.set(3, bailey);
	doctors.set(4, avery);
	return doctors;
	}
	
	public static List<Patient> patientFiller(){
		List<Patient> patients = new ArrayList<>();
		Patient downe = new Patient("O+","1995/02/13","George Downe", "PB92134D");
		Patient hignett = new Patient("A-","1996/01/02","Jordan Hignett", "PB23134D");
		Patient gadd = new Patient("AB-","1998/12/04","Matthew Gadd", "PG1324Q");
		patients.set(0,downe);
		patients.set(1,hignett);
		patients.set(2, gadd);
		return patients;
		
	}
}
