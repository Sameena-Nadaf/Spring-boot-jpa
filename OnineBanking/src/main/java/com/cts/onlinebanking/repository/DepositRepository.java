package com.cts.onlinebanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.Deposit;

public interface DepositRepository extends JpaRepository<Deposit, Integer>{
	
	List<Deposit> findAll();

}
