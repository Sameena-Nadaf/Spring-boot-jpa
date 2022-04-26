package com.cts.onlinebanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue
	private int id;

	private String userName;
	private String password;
	private String roles;
	private boolean isActive;

	public Users() {
	}

	public Users(String userName, String password, String roles, boolean isActive) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
		this.isActive = isActive;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
