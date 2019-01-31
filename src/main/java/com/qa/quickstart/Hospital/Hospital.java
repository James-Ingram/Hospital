package com.qa.quickstart.Hospital;

import java.util.*;
import com.qa.quickstart.Persons.*;

public class Hospital {
	
	
	private int noOfWards,noOfTeams;
	public Hospital(int noOfTeams, int noOfWards) {
		this.setNoOfTeams(noOfTeams);
		this.setNoOfWards(noOfWards);
	}

	public List<Ward> sortToWard(Patient newPatient, List<Ward> wardList)
	{
		
		
		
		wardList = wardPlacement(wardSelection(wardList), newPatient, wardList );
		
		return wardList;
		
		
		
	}  
	public List<Ward> wardPlacement(int reference, Patient newPatient, List<Ward> wardList) { 
		List<Patient> tempPatient = new ArrayList<Patient>();
		tempPatient= wardList.get(reference).getPatients();
		tempPatient.add(newPatient);
		
		(wardList.get(reference)).setPatients(tempPatient);
		
		return wardList;
	}
	public int wardSelection(List<Ward> wardList) {  
		List<Integer> sizes = new ArrayList<Integer>();
		for(int i = 0 ; i < 14 ; i++) { 

			Ward dummyWard =(wardList.get(i)); 
			sizes.add(dummyWard.getPatients().size()); 
			
		}   
		int min = 21; 
		int reference = 0;
		for (int j = 0 ; j < 14 ; j++) { 
			
			 
			if (sizes.get(j)<min) { 
				min = sizes.get(j); 
				reference = j;
			} 
			else { 
				
			}
		}
		return reference;
		
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
