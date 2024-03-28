package com.isabelareis.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelareis.projeto.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
