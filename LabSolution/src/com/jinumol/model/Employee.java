package com.jinumol.model;

public class Employee {
 String firstName;
 String lastName;
  public String getFirstName() {
	return firstName;
	  
  }
  public void setFirstName(String firstname) {
	  this.firstName=firstname;
  }
  public String getLastName() {
		return lastName;
		  
	  }
  public void setLastName(String lastname) {
	  this.lastName=lastname;
  }
  public Employee(String firstname,String lastname) {
	  this.firstName=firstname;
	  this.lastName=lastname;
	  
  }
}

