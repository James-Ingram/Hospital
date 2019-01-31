package com.qa.quickstart.Hospital;

import java.util.ArrayList;
import java.util.List;

import com.qa.quickstart.Persons.Patient;

public class Ward {

	private int wardReference =0;
	private List<Patient> patients = new ArrayList<Patient>();
	public Ward(int wardReference, List<Patient> patients) {
		this.setPatients(patients);
		this.wardReference=wardReference;
	}
	public int getWardReference() {
		return wardReference;
	}
	public void setWardReference(int wardReference) {
		this.wardReference = wardReference;
	}
	
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}


}
