package com.qa.AccountSystem.domain;

import java.io.Serializable;


public class POJOAccount implements Serializable {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public POJOAccount() {
		
	}
	
	public POJOAccount(String firstName, String lastName, String accountNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.accountNumber=accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
