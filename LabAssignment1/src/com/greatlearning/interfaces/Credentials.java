package com.greatlearning.interfaces;

import com.greatlearning.modal.Employee;

public interface Credentials {
	public String generateEmailAddress(String firstName,String lastName, String department);
	
	public String generatePassword();
	
	public void ShowCredentials(Employee employee);
}