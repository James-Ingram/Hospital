package com.qa.quickstart.Hospital;

import java.util.*;
import com.qa.quickstart.Persons.*;

public class Hospital {
	
	private int noOfWards,noOfTeams;
	public Hospital(int noOfTeams, int noOfWards) {
		this.setNoOfTeams(noOfTeams);
		this.setNoOfWards(noOfWards);
	}
	public List<Patient> sortToWard(Patient newPatient)
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
