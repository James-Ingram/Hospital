package com.qa.quickstart.Hospital;

import java.util.*;

import com.qa.quickstart.Persons.*;

public class App 
{
    public static void main( String[] args )
    {
    	Patient patient = new Patient("","","","");
		patient.setBloodType("A-");
		patient.setDOB("1992/05/11");
		patient.setName("James oragne");
		patient.setNIN("PB969162");
    	//Patient james =new Patient("A-","1997/05/11","James Ingram","PB969162");
    	List<Ward> mainWards =Hospital.createHospital();
    	List<Team> teams = Hospital.createTeams();
    	//Patient newPatient = Admin.admitPatient();
    	//Hospital.sortToWard(newPatient, mainWards);
    	Hospital.sortToWard(patient, mainWards);
    	
    	Doctor grey = new Doctor("General Surgery", 2, true, "1978/08/13", "Meredith Grey", "PJ13424N");
    	
    	Hospital.assignDoctorToTeam(0, grey, teams);
    	//System.out.println(newPatient);
    	//Nurse.lookUpTreatment(newPatient);
    	//Doctor.addTreatment(newPatient);
    	//Nurse.lookUpTreatment(newPatient);
    	//System.out.println("List Of Teams: "+teams.toString());
    	//Team.toString(teams);
    	Admin.showInformation(mainWards, teams);
    }
}
