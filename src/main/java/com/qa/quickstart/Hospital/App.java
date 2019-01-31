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
    	Patient newPatient = Admin.admitPatient();
    	Hospital.sortToWard(newPatient, mainWards);
    	Hospital.sortToWard(patient, mainWards);
    	//System.out.println(newPatient);
    	//Nurse.lookUpTreatment(newPatient);
    	//Doctor.addTreatment(newPatient);
    	//Nurse.lookUpTreatment(newPatient);
    	
    	Ward.toString(mainWards);
    }
}
