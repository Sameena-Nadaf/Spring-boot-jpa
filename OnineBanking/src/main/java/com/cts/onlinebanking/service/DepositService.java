package com.cts.onlinebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.onlinebanking.model.CurrentAccount;
import com.cts.onlinebanking.model.Deposit;
import com.cts.onlinebanking.model.SavingsAccount;
import com.cts.onlinebanking.repository.CurrentAccountRepository;
import com.cts.onlinebanking.repository.DepositRepository;
import com.cts.onlinebanking.repository.SavingsAccountRepository;

@Service
public class DepositService {
	
	@Autowired
	CurrentAccountRepository cRepository;
	
	@Autowired
	SavingsAccountRepository sRepository;
	
	@Autowired
	DepositRepository depositRepository;
	
	public int depositAmount(Deposit deposit,String userName)
	{
		deposit.setUserName(userName);
		String accountType = deposit.getAccountType();
		if(accountType.equalsIgnoreCase("Savings Account"))
		{
			SavingsAccount sAccount = sRepository.findByUserName(userName);
			float tot = sAccount.getBalance()+deposit.getDepositAmt();
			sAccount.setBalance(tot);
			deposit.setBalance(tot);
			depositRepository.save(deposit);
			sRepository.save(sAccount);
			return 1;
		}
		else
		{
			CurrentAccount cAccount = cRepository.findByUserName(userName);
			float tot = cAccount.getBalance()+deposit.getDepositAmt();
			cAccount.setBalance(tot);
			deposit.setBalance(tot);
			depositRepository.save(deposit);
			cRepository.save(cAccount);
			return 1;
		}
		
	
	}
}
