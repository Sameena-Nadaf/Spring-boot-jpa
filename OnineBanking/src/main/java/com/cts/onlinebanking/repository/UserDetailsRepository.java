package com.cts.onlinebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.UserDetailsList;

public interface UserDetailsRepository extends JpaRepository<UserDetailsList, Integer>{

}
