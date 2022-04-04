package com.example.demo.api.user.repository;

import java.util.List;

import com.example.demo.api.user.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

  List<UserEntity> findByUserName(String userName);

}
