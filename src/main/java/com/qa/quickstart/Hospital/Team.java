package com.qa.quickstart.Hospital;

import java.util.ArrayList;
import java.util.List;

import com.qa.quickstart.Persons.Doctor;

public class Team {

	private int doctorReference;
	private List<Doctor> doctors = new ArrayList<>();
	
	public Team(int doctorReference,List<Doctor> doctors) {
		this.doctors = doctors; 
		this.doctorReference =doctorReference;
		
	}
	
	public  String toString() {
		return doctors.toString()+"\n";
	}
	public int getDoctorReference() {
		return doctorReference;
	}

	public void setDoctorReference(int doctorReference) {
		this.doctorReference = doctorReference;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}


}
