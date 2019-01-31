package com.qa.quickstart.Persons;

import java.util.Date;

public abstract class Employee extends Stakeholder {

	public Employee(String name, Date DOB, String NIN) {
		super(name, DOB, NIN);
	}
	@Override
	public int generateID() {
		id+=1;
		return Integer.parseInt("9"+id);
	}

}
