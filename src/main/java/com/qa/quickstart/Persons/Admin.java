package com.qa.quickstart.Persons;

import java.util.Date;

public class Admin extends Employee {

	private String title, accessLevel;
	public Admin(String name, Date DOB, String NIN, String accessLevel, String title) {
		super(name, DOB, NIN);
		this.title = title;
		this.accessLevel= accessLevel;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

}
