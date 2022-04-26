package com.cts.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.TransferOthersAccount;

public interface TransferRepository extends JpaRepository<TransferOthersAccount, Integer> {
	
	

}
