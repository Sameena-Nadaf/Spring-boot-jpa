package com.cts.onlinebanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Withdraw {

	@Id
	@GeneratedValue
	private int id;

	private String userName;
	private String accType;
	private int withdrawlAmt;
	
	
	private float balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getWithdrawlAmt() {
		return withdrawlAmt;
	}

	public void setWithdrawlAmt(int withdrawlAmt) {
		this.withdrawlAmt = withdrawlAmt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
