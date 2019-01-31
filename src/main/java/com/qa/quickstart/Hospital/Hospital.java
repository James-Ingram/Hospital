package com.qa.quickstart.Hospital;

import java.util.*;
import com.qa.quickstart.Persons.*;

public class Hospital {

	private int noOfWards, noOfTeams;

	public Hospital(int noOfTeams, int noOfWards) {
		this.setNoOfTeams(noOfTeams);
		this.setNoOfWards(noOfWards);
	}

	public static List<Ward> sortToWard(Patient newPatient, List<Ward> wardList) {

		wardList = wardPlacement(wardSelection(wardList), newPatient, wardList);

		return wardList;

	}

	public static  List<Ward> wardPlacement(int reference, Patient newPatient, List<Ward> wardList) {
		List<Patient> tempPatient = new ArrayList<Patient>();
		tempPatient = wardList.get(reference).getPatientsInWard(); 
		tempPatient.add(newPatient);
		
		(wardList.get(reference)).setPatientsInWard(tempPatient);
	
		return wardList;
	}

	public static int wardSelection(List<Ward> wardList) {
		List<Integer> sizes = new ArrayList<Integer>();
		for (int i = 0; i < 14; i++) {

			Ward dummyWard = (wardList.get(i));
			sizes.add(dummyWard.getPatientsInWard().size());

		}
		int min = 21;
		int reference = 0;
		for (int j = 0; j < 14; j++) {

			if (sizes.get(j) < min) {
				min = sizes.get(j);
				reference = j;
			} else {
			}
		}
		return reference;

	}
	public static List<Team> createTeams() {
		List<Team> teams = new ArrayList<>();
		List<Doctor> doctors = new ArrayList<>(20);
		for (int i = 0; i < 14; i++) {
			teams.add(new Team(i, new ArrayList<>(doctors)));
		}
		return teams;

	}

	public static List<Ward> createHospital() {
		List<Ward> wardList = new ArrayList<Ward>();
		List<Patient> patients = new ArrayList<Patient>(20);
		for (int i = 0; i < 14; i++) {
			wardList.add(new Ward(i, new ArrayList<>(patients)));
		}
		return wardList;

	}
	
	public static List<Team> assignDoctorToTeam(int reference, Doctor transferDoctor, List<Team> teams){
			List<Doctor> tempDoctor = new ArrayList<>();
			tempDoctor= teams.get(reference).getDoctors(); 
			tempDoctor.add(transferDoctor);
			
			(teams.get(reference)).setDoctors(tempDoctor);
		
			return teams;
		}

		public static int teamSelection(List<Team> teams) {
			List<Integer> sizes = new ArrayList<Integer>();
			for (int i = 0; i < 14; i++) {

				Team dummyTeam = (teams.get(i));
				sizes.add(dummyTeam.getDoctors().size());

			}
			int min = 21;
			int reference = 0;
			for (int j = 0; j < 14; j++) {

				if (sizes.get(j) < min) {
					min = sizes.get(j);
					reference = j;
				} else {
				}
			}
			return reference;

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