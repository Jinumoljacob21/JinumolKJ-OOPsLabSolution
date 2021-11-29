package com.jinumol.service;

import java.util.Random;
import java.util.Scanner;

import com.jinumol.model.Employee;

public class CredentialService {
	 String email;
	 String password;
	 String upperCaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	  String lowerCaseLetters="abcdefghijklmnopqrstuvwxyz";
	  String numbers="0123456789";
	  String specialCharacters="@#$&*!";
	  String combinationChar=upperCaseLetters+lowerCaseLetters+numbers+specialCharacters;
	  
	  Employee employee=new Employee("Juan","Davis");

	public  char[] generatePassword(){
	Random random=new Random();
	char[] password=new char[8];
	
	for(int i=0;i<8;i++) {
		
		password[i]=combinationChar.charAt(random.nextInt(combinationChar.length()));
		
	}
	return password;
	
	}
	
	public String generateEmail(Employee employee, String dept) {
		String firstName=employee.getFirstName();
		String lastName=employee.getLastName();
		String email=firstName+lastName+"@"+dept+".abc.com";
		
		return email;
		
	}
	public  void showCredentials(Employee employee,String dept) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email-->  "+generateEmail( employee,dept));
		System.out.print("Password--> ");
		System.out.print(generatePassword());
	
	}

}
