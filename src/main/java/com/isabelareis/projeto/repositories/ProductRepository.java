package com.isabelareis.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelareis.projeto.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
