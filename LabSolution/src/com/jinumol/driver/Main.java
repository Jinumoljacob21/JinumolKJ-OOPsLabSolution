package com.jinumol.driver;
import java.util.Scanner;

import com.jinumol.model.Employee;
import com.jinumol.service.CredentialService;
public class Main {
	public static void main(String args[]) {
		
		CredentialService cs=new CredentialService();
		
		 Employee employee=new Employee("Juan","Davis");
		 
		System.out.println("Generate Employee Email ID and Password");
		System.out.println("Please enter the department number from the following");
		System.out.println("1: Technical"); 
		System.out.println("2: Admin");
		System.out.println("3: Human Resource");
		System.out.println("4: Legal");
		 
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option) {
		case 1:			
			cs.generateEmail( employee, "tech");
			cs.generatePassword();
			cs.showCredentials(employee,"tech");
			break;
			
		case 2:
			cs.generateEmail( employee, "admin");
			cs.generatePassword();
			cs.showCredentials(employee, "admin");
			break;
			
		case 3:
			cs.generateEmail( employee, "hr");
			cs.generatePassword();
			cs.showCredentials(employee, "hr");
			break;
			
		case 4:
			cs.generateEmail( employee, "legel");
			cs.generatePassword();
			cs.showCredentials(employee, "legel");
			break;
		default:
			System.out.println("Enter valid department number");
			
		}
		
		sc.close();
	}

}

