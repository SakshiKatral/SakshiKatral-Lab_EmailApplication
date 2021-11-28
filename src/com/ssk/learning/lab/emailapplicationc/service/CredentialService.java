package com.ssk.learning.lab.emailapplicationc.service;

import java.security.SecureRandom;

import com.ssk.learning.lab.emailapplication.bean.Employee;

public class CredentialService {
	final private int length = 8;
	char[] password = new char[length];
	String email;
	String firstName;

	public void generateEmail(Employee employee){
		firstName = employee.getFirstName();
		email =  (employee.getFirstName() + employee.getLastName() + "@" 
				+ employee.getDeparmentName() + ".ssklearning.com").toLowerCase().replaceAll(" ", ""); 
	}

	public void generatePassword() {
		String allCharecters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
		SecureRandom random = new SecureRandom();

		for(int i = 0; i < length; i++){
			password[i] = allCharecters.charAt(random.nextInt(allCharecters.length()));
		}

	}
	public void showCredentials() {
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email     ----> " + email);
		System.out.println("Password  ----> " + String.valueOf(password));
	}
}
