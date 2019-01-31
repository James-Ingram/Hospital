package com.qa.quickstart.Hospital;

import java.util.*;
import com.qa.quickstart.Persons.*;

public class Hospital {
	
	
	private int noOfWards,noOfTeams;
	public Hospital(int noOfTeams, int noOfWards) {
		this.setNoOfTeams(noOfTeams);
		this.setNoOfWards(noOfWards);
	}
	
	public static List<Ward> createHospital(){
		List<Ward> wardList = new ArrayList<Ward>();
		List<Patient> patients = new ArrayList<Patient>(20);
		for(int i = 0; i<14;i++)
		{
			wardList.add(new Ward(i, patients));
		}
		return wardList;
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
