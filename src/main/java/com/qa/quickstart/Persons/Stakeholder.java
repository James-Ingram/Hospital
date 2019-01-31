package com.qa.quickstart.Persons;

//import java.util.Date;

public abstract class Stakeholder {
	public int id=1;
	private String name;
	private String DOB;
	private String NIN;

	public Stakeholder(String name, String DOB, String NIN) {
		this.name = name;
		this.DOB = DOB;
		this.NIN = NIN;

	}
	public int generateID() {
		id+=1;
		return Integer.parseInt("1"+id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getNIN() {
		return NIN;
	}

	public void setNIN(String nIN) {
		NIN = nIN;
	}
}
