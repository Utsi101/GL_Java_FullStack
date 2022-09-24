package com.greatlearning.service;

import com.greatlearning.model.Super_Department;

public class Admin_Department extends Super_Department {

	@Override
	public String departmentName() {
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
