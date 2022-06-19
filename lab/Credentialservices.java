package com.gl.lab.service;
import java.util.Random;

import com.gl.lab.Employe;

public class Credentialservices {
public char[] generatePassword(Employe employe) {
		
		String pattern= "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*()1234567890abcdefghijklmnopqrstuvwxyz";
		int length = 8;
		Random random = new Random();
		char[] password = new char[8];
		
		for(int i=0;i<length;i++) {
			password[i]=pattern.charAt(random.nextInt(pattern.length()));
		}
		employe.setPassword(password);
		return password;
	}
	
	public String generateEmailAddress(Employe employee) {
		
		String company= ".romsons.com";		
		String email = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+company;
		employee.setEmail(email);
		return email;
	}
	
	public void showCredentials(Employe employe) {
		
		System.out.println("Dear "+ employe.getFirstName()+" your generated credenials are as follows: ");		
		System.out.println("email: "+employe.getEmail());
		System.out.println("Password: "+ employe.getPassword().toString());
		
	}
}



