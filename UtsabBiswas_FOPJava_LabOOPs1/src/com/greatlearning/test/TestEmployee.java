package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee("Utsab", "Biswas");
		CredentialServiceImpl service = new CredentialServiceImpl();

		System.out.println("Please enter the department number from the following: \n" + "1. Technical\n" + "2. Admin\n"
				+ "3. Human Recourse\n" + "4. Legal");

		Scanner scanner = new Scanner(System.in);

		int deptNo = scanner.nextInt();
		String dept = "";

		switch (deptNo) {

		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "adm";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "lg";
			break;
		default:
			System.out.println("Enter a valid option: ");
			break;

		}
		String generatedEmail = service.generateEmailAddress(employee.getFirstName(), employee.getLastName(), dept);
		String generatedPassword = service.generatePassword();
		service.showCredentials(employee, generatedEmail, generatedPassword);
		scanner.close();
	}

}
