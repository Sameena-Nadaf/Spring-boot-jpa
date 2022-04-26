package com.cts.onlinebanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class UserRegistration {
	
	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message="Name cannot be empty")
	private String name;
	
	@NotBlank(message="Email cannot be empty")
	@Email(message="Enter valid Email")
	private String email;
	
	@Size(max=10,min=10,message="Invalid Phone Number")
	private String phoneNumber;
	
	@NotBlank(message="User Name cannot be empty")
	private String userName;
	
	@NotBlank(message="Password cannot be empty")
	private String password;


	public UserRegistration() {

	}

	public UserRegistration(int id, String name, String email, String phoneNumber, String userName,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

}
