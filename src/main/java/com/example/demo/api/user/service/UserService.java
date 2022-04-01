package com.example.demo.api.user.service;

import com.example.demo.api.user.entity.User;
import com.example.demo.api.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public void save(User user) {
    repo.save(user);
  }

}
