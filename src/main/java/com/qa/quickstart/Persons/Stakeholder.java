package com.qa.quickstart.Persons;

import java.util.Date;

public abstract class Stakeholder {
	private String name;
	private Date DOB;
	private String NIN;

	public Stakeholder(String name, Date DOB, String NIN) {
		this.name = name;
		this.DOB = DOB;
		this.NIN = NIN;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getNIN() {
		return NIN;
	}

	public void setNIN(String nIN) {
		NIN = nIN;
	}
}
