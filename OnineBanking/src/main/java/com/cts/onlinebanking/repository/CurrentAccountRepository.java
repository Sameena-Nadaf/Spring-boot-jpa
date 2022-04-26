package com.cts.onlinebanking.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cts.onlinebanking.model.CurrentAccount;

@Transactional
public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, Integer> {

	List<CurrentAccount> findAll();
	CurrentAccount findByUserName(String userName);
	CurrentAccount findByAccountNumber(int accountNumber);
	void deleteByUserName(String userName);
	
}
