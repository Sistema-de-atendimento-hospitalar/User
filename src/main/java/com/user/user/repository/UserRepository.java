package com.user.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.user.domain.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	UserModel findByEmail(String email);

}
