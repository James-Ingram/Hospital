package com.qa.quickstart.Hospital;

import java.util.*;
import com.qa.quickstart.Persons.*;

public class Hospital {
	
	
	private int noOfWards,noOfTeams;
	public Hospital(int noOfTeams, int noOfWards) {
		this.setNoOfTeams(noOfTeams);
		this.setNoOfWards(noOfWards);
	}
<<<<<<< HEAD
	public List<Patient> sortToWard(Patient newPatient, List<Patient> patients, List<Ward> wardList)
	{
		
		
		
		patients.add(newPatient); 
//		return wardList;
		
		
		return patients;
=======
	
	public static List<Ward> createHospital(){
		List<Ward> wardList = new ArrayList<Ward>();
		List<Patient> patients = new ArrayList<Patient>(20);
		for(int i = 0; i<14;i++)
		{
			wardList.add(new Ward(i, patients));
		}
		return wardList;
>>>>>>> efd29e855b45d58d1be9fedb0e2c489a662309a0
	}
	public static List<Patient> sortToWard(Patient newPatient)
	{
		List<Patient> ward= new ArrayList<Patient>();
		return ward;
	}
	public int getNoOfTeams() {
		return noOfTeams;
	}
	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}
	public int getNoOfWards() {
		return noOfWards;
	}
	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}

}
