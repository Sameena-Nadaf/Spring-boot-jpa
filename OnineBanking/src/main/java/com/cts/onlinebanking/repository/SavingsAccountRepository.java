package com.cts.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Integer> {
	
	SavingsAccount findByUserName(String userName);
	SavingsAccount findByAccountNumber(int accountNumber);
	void deleteByUserName(String userName);
}
