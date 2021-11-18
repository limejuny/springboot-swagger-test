package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, String> {
  Optional<User> findByUserName(String userName);
}
