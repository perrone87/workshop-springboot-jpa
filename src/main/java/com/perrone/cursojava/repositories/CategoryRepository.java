package com.perrone.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perrone.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
