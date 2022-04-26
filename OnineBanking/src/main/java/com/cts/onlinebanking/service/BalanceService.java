package com.cts.onlinebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.onlinebanking.model.CurrentAccount;
import com.cts.onlinebanking.model.SavingsAccount;
import com.cts.onlinebanking.repository.CurrentAccountRepository;
import com.cts.onlinebanking.repository.SavingsAccountRepository;

@Service
public class BalanceService {
	
	
	SavingsAccountRepository sRepository;
	CurrentAccountRepository cRepository;
	
	@Autowired
	public BalanceService(SavingsAccountRepository sRepository, CurrentAccountRepository cRepository) {
		this.sRepository = sRepository;
		this.cRepository = cRepository;
	}
	
	public int savingsBalance(String name)
	{
		int balance=0;
		SavingsAccount account = sRepository.findByUserName(name);
		balance = (int) account.getBalance(); 
		return balance;
	}
	
	public int currentBalance(String name)
	{
		int balance=0;
		CurrentAccount account = cRepository.findByUserName(name);
		balance = (int) account.getBalance(); 
		return balance;
	}
	
	
	
	

}
