package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
@Api(tags = { "유저 관련 컨트롤러" })
public class UserController {

  @Autowired
  UserService userService;

  @ApiOperation(value = "간단하게 표시되는 내용", notes = "API 설명설명")
  @ApiResponses({
      @ApiResponse(code = 200, message = "로그인 성공"),
      @ApiResponse(code = 401, message = "로그인 실패")
  })
  @PostMapping(value = "/signup", produces = "application/json", consumes = "application/json")
  public String signup(
      @RequestBody User user) {
    userService.save(user);
    return "save";
  }

}
