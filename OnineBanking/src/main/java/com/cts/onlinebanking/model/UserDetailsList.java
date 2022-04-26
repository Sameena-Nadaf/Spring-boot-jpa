package com.cts.onlinebanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetailsList {

	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String userName;
	private int savingsNumber;
	private int currentNumber;
	private float currentBalance;
	private float savingsBalance;

	public UserDetailsList() {
		super();
	}

	public UserDetailsList(int id, String name, String userName, int savingsNumber, int currentNumber, float currentBalance,
			float savingsBalance) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.savingsNumber = savingsNumber;
		this.currentNumber = currentNumber;
		this.currentBalance = currentBalance;
		this.savingsBalance = savingsBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSavingsNumber() {
		return savingsNumber;
	}

	public void setSavingsNumber(int savingsNumber) {
		this.savingsNumber = savingsNumber;
	}

	public int getCurrentNumber() {
		return currentNumber;
	}

	public void setCurrentNumber(int currentNumber) {
		this.currentNumber = currentNumber;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public float getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	@Override
	public String toString() {
		return "UserDetailsList [id=" + id + ", name=" + name + ", userName=" + userName + ", savingsNumber="
				+ savingsNumber + ", currentNumber=" + currentNumber + ", currentBalance=" + currentBalance
				+ ", savingsBalance=" + savingsBalance + "]";
	}
	

}
