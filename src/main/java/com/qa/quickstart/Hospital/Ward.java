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
	
	
	public static void toString(List<Ward> wardList) {
		List<Patient> patients = new ArrayList<Patient>();
		for(int i = 0;i<wardList.size();i++)
		{
			System.out.println("\nWard " +i + " contains: ");
			patients = (wardList.get(i)).getPatientsInWard();
			System.out.println(wardList.get(i).getWardReference());
			for(int j = 0; j<patients.size();j++)
			{
				System.out.println(patients.get(j).toString());

			}
		}
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
