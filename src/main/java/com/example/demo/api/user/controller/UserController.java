package com.example.demo.api.user.controller;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;
import com.example.demo.api.user.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@Api(tags = { "유저 관련 컨트롤러" })
public class UserController {

  private final UserService userService;

  @ApiOperation(value = "회원가입", notes = "API 설명설명")
  @ApiResponses({
      @ApiResponse(code = 200, message = "로그인 성공"),
      @ApiResponse(code = 401, message = "로그인 실패")
  })
  @PostMapping(value = "/signup", produces = "application/json", consumes = "application/json")
  public UserSignupRes signup(@RequestBody UserSignupReq user) {
    return userService.signup(user);
  }

}
