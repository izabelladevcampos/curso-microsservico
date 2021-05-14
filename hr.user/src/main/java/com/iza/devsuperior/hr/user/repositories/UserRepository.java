package com.iza.devsuperior.hr.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iza.devsuperior.hr.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail (String email);

}
