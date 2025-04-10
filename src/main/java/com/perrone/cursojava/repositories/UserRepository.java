package com.perrone.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perrone.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
