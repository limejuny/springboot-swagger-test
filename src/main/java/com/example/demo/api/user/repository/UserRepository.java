package com.example.demo.api.user.repository;

import java.util.Optional;

import com.example.demo.api.user.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, String> {
  Optional<User> findByUserName(String userName);
}
