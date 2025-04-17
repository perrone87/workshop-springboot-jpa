package com.perrone.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perrone.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
