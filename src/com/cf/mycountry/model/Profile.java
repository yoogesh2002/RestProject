package com.cf.mycountry.model;

import java.util.Date;

public class Profile {
	
	private String guid;
	private String username;
	private String password;
	private Date lastLoginDate;
	
	
	public Profile() {
		super();
	}


	public Profile(String guid, String username, String password, Date lastLoginDate) {
		super();
		this.guid = guid;
		this.username = username;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
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


	public Date getLastLoginDate() {
		return lastLoginDate;
	}


	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	


}