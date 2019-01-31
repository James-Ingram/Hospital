package com.qa.quickstart.Hospital;

import java.util.*;

import com.qa.quickstart.Persons.*;

public class App 
{
    public static void main( String[] args )
    {

    	//Patient james =new Patient("A-","1997/05/11","James Ingram","PB969162");
    	Hospital.createHospital();
    	Patient newPatient = Admin.admitPatient();
    	Hospital.sortToWard(newPatient);
    	System.out.println(Patient.toString(newPatient));
    	Nurse.lookUpTreatment(newPatient);
    	Doctor.addTreatment(newPatient);
    	Nurse.lookUpTreatment(newPatient);
    	
    }
}
