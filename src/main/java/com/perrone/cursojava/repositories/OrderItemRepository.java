package com.perrone.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perrone.cursojava.entities.OrderItem;
import com.perrone.cursojava.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
