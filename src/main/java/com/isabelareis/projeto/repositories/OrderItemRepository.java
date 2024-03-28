package com.isabelareis.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelareis.projeto.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {

}
