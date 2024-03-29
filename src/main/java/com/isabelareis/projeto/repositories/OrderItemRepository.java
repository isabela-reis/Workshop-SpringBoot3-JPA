package com.isabelareis.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelareis.projeto.entities.OrderItem;
import com.isabelareis.projeto.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
