package com.cf.mycountry.model;

public class Student {
	
	private String name;
	private String RollNo;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String rollNo) {
		super();
		this.name = name;
		RollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRollNo() {
		return RollNo;
	}


	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	
	
	

}
