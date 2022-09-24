package com.greatlearning.test;

import com.greatlearning.service.Admin_Department;
import com.greatlearning.service.Hr_Department;
import com.greatlearning.service.Tech_Department;

public class Test_Department {

	public static void main(String[] args) {

		Admin_Department adminDepartment = new Admin_Department();
		Hr_Department hrDepartment = new Hr_Department();
		Tech_Department techDepartment = new Tech_Department();

		System.out.println("Welcome to " + adminDepartment.departmentName() + "\n"
				+ adminDepartment.getTodaysWork() + "\n"
				+ adminDepartment.getWorkDeadline() + "\n"
				+ adminDepartment.isTodayAHoliday() + "\n");

		System.out.println("Welcome to " + hrDepartment.departmentName() + "\n"
				+ hrDepartment.doActivity() + "\n"
				+ hrDepartment.getTodaysWork() + "\n"
				+ hrDepartment.getWorkDeadline() + "\n"
				+ hrDepartment.isTodayAHoliday() + "\n");
		
		System.out.println("Welcome to " + techDepartment.departmentName() + "\n"
				+ techDepartment.getTodaysWork() + "\n"
				+ techDepartment.getWorkDeadline() + "\n"
				+ techDepartment.getTechStackInformation() + "\n"
				+ techDepartment.isTodayAHoliday());
		
	}

}
