package com.qa.quickstart.Hospital;

import java.util.ArrayList;
import java.util.List;

import com.qa.quickstart.Persons.Patient;

public class Ward {

	private int wardReference =0;
	private List<Patient> patientsInWard = new ArrayList<Patient>();
	
	public Ward(int wardReference, List<Patient> patients) {
		this.patientsInWard= patients;
		this.wardReference=wardReference;
	}
	
	
	public  String toString() {
		return patientsInWard.toString()+"\n";
	}
	
	public int getWardReference() {
		return wardReference;
	}
	public void setWardReference(int wardReference) {
		this.wardReference = wardReference;
	}
	
	public List<Patient> getPatientsInWard() {
		return patientsInWard;
	}
	public void setPatientsInWard(List<Patient> patients) {
		this.patientsInWard = patients;
	}


}
