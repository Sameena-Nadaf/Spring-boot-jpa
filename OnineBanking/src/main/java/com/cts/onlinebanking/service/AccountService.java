package com.cts.onlinebanking.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.onlinebanking.model.CurrentAccount;
import com.cts.onlinebanking.model.SavingsAccount;
import com.cts.onlinebanking.model.UserRegistration;
import com.cts.onlinebanking.repository.CurrentAccountRepository;
import com.cts.onlinebanking.repository.SavingsAccountRepository;

@Service
public class AccountService {
	
	@Autowired
	CurrentAccountRepository cRepository;
	
	@Autowired
	SavingsAccountRepository sRepository;
	
	public void generateAccountNumber(UserRegistration user)
	{
		SavingsAccount sa = new SavingsAccount();
		CurrentAccount ca = new CurrentAccount();
		Random r = new Random();
		int randNum = r.nextInt(111111111);
		sa.setUserName(user.getUserName());
		ca.setUserName(user.getUserName());
		sa.setAccountNumber(randNum);
		ca.setAccountNumber(randNum+1);
		sa.setBalance(0);
		ca.setBalance(0);
		cRepository.save(ca);
		sRepository.save(sa);
	}

}
