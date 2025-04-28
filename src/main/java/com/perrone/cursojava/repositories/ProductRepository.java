package com.perrone.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perrone.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
