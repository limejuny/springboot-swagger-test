package com.example.demo.api.user.service;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;
import com.example.demo.api.user.entity.UserEntity;
import com.example.demo.api.user.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public UserSignupRes signup(UserSignupReq user) {
    return toUserSignupRes(userRepository.save(toUserEntity(user)));
  }

  private UserEntity toUserEntity(UserSignupReq userSignupReq) {
    return UserEntity.builder()
        .userId(userSignupReq.getUserId())
        .userName(userSignupReq.getUserName())
        .userPasswd(userSignupReq.getUserPasswd())
        .build();
  }

  private UserSignupRes toUserSignupRes(UserEntity userEntity) {
    return UserSignupRes.builder()
        .userId(userEntity.getUserId())
        .userName(userEntity.getUserName())
        .build();
  }

}
