package com.isabelareis.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabelareis.projeto.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
