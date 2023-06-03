package com.example.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
	Ville findById(int id);

}
