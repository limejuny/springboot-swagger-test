package com.example.demo.api.user.entity;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

  UserSignupRes toUserSignupRes(UserEntity userEntity);

  UserEntity toUserEntity(UserSignupReq userSignupReq);

}
