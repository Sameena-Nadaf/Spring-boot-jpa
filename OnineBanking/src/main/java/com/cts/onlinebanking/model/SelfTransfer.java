package com.cts.onlinebanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SelfTransfer {

	@Id
	@GeneratedValue
	private int Id;

	private int amount;
	private String acc1;
	private String acc2;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAcc1() {
		return acc1;
	}

	public void setAcc1(String acc1) {
		this.acc1 = acc1;
	}

	public String getAcc2() {
		return acc2;
	}

	public void setAcc2(String acc2) {
		this.acc2 = acc2;
	}

}
