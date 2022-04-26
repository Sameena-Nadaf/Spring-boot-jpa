package com.cts.onlinebanking.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.onlinebanking.model.Users;


public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUserName(String userName);

	void deleteByUserName(String userName);

	Users findByRoles(String name);
}
