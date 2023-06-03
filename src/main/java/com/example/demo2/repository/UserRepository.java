package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>  {
	User findById(int id);
}
