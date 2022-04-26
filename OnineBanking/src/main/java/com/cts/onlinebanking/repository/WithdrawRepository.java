package com.cts.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.Withdraw;

public interface WithdrawRepository extends JpaRepository<Withdraw, Integer> {

}
