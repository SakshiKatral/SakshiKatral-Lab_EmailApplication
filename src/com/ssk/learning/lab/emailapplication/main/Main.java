package com.ssk.learning.lab.emailapplication.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.ssk.learning.lab.emailapplication.bean.Employee;
import com.ssk.learning.lab.emailapplicationc.service.CredentialService;

public class Main {

	public static void main(String[] args) {
		int choice = 1;
		String collection;

		HashMap<Integer, String> deparmentMap = new HashMap<>();
		deparmentMap.put(1, "Technical");
		deparmentMap.put(2, "Admin");
		deparmentMap.put(3, "Human Resource");
		deparmentMap.put(4, "Legal");

		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Please enter employee's first name");
			String empFirstName = scanner.next();
			System.out.println("Please enter employee's last name");
			String empLastName = scanner.next();
			Employee employee = null;

			System.out.println("Please enter department from the following\n1. Technical"
					+ "\n2. Admin\n3. Human Resource\n4. Legal\n");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				employee = new Employee(empFirstName, empLastName, deparmentMap.get(choice));
				break;

			case 2: 
				employee = new Employee(empFirstName, empLastName, deparmentMap.get(choice));
				break;

			case 3:
				employee = new Employee(empFirstName, empLastName, deparmentMap.get(choice));
				break;

			case 4: 
				employee = new Employee(empFirstName, empLastName, deparmentMap.get(choice));
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
			CredentialService credentialService = new CredentialService();
			credentialService.generateEmail(employee);
			credentialService.generatePassword();
			credentialService.showCredentials();
			System.out.println("Do you want to continue if yes press y else press any other key");
			collection = scanner.next();
		}while(collection.equalsIgnoreCase("y"));
		System.out.println("Thank you");

	}

}
