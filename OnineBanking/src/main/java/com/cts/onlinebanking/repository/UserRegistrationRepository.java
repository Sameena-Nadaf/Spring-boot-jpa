package com.cts.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.UserRegistration;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Integer>{
	
	UserRegistration findByUserName(String userName);

	void deleteByUserName(String userName);

}
