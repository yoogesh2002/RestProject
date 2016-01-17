package com.cf.mycountry.model;

public class Customer {
	
	private String guid;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String ContactNo;
	
	
	public Customer() 
	{
		super();

	}


	public Customer(String username, String password, String firstName, String lastName, String contactNo) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		ContactNo = contactNo;
	}


	public String getGuid() {
		return guid;
	}


	public void setGuid(String guid) {
		this.guid = guid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getContactNo() {
		return ContactNo;
	}


	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	
	
}
