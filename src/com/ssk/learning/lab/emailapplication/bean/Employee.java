package com.ssk.learning.lab.emailapplication.bean;

public class Employee {
	private String firstName;
	private String lastName;
	private String deparmentName;
	public Employee() {}

	public Employee(String firstName, String lastName,String departmentName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.deparmentName = departmentName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}

}
