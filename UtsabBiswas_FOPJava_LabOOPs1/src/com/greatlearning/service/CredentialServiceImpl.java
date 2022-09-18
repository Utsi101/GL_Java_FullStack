package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String upperAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerAlpha = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChar = "!@#$%^&*_+-|;':,.<>?/";
		String passwordValues = upperAlpha + lowerAlpha + numbers + specialChar;

		char[] password = new char[8];

		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			password[i] = passwordValues.charAt(random.nextInt(passwordValues.length()));
		}

		return String.valueOf(password);
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return (firstName + lastName + "@" + department + ".greatlearning.com").toLowerCase();
	}

	@Override
	public void showCredentials(Employee employee, String email, String generatedPassword) {
		// TODO Auto-generated method stub
		System.out.println("Hi " + employee.getFirstName() + " " + employee.getLastName() + " your credentials are: ");
		System.out.println("Email: " + email);
		System.out.println("Password: " + generatedPassword);
	}
}
