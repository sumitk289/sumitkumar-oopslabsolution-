package com.gl.lab.driverr;
import java.util.Scanner;

import com.gl.lab.Employe;
import com.gl.lab.service.Credentialservices;


public class Driverr {

	public static void main(String[] args) {
String firstName,lastName,department = null;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your first name");
		firstName =  sc.next();
		
		System.out.println("Enter your last name");
		lastName =  sc.next();
		
		System.out.println("Please enter the department from the following:\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int dept=sc.nextInt();
		switch (dept) {
		case 1:
			department = "Technical";
			break;
			
		case 2:
			department = "Admin";
			break;
		
		case 3:
			department = "Human Resource";
			break;
		
		case 4:
			department = "Legal";
			break;
			 
		}
		
		Employe emp = new Employe (firstName,lastName,department);
		Credentialservices empcred= new Credentialservices();
		empcred.generateEmailAddress(emp);
		empcred.generatePassword(emp);
		empcred.showCredentials(emp);
	}



	}


