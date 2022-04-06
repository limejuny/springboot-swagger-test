package com.example.demo.api.user.controller;

import com.example.demo.api.user.dto.UserSignupReq;
import com.example.demo.api.user.dto.UserSignupRes;
import com.example.demo.api.user.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@Tag(name = "유저 관련 컨트롤러")
public class UserController {

  private final UserService userService;

  @Operation(summary = "회원가입", description = "회원가입 API 설명")
  @ApiResponses({
      @ApiResponse(responseCode = "200", description = "로그인 성공"),
      @ApiResponse(responseCode = "401", description = "로그인 실패", content = @Content)
  })
  @PostMapping(value = "/signup")
  public UserSignupRes signup(@RequestBody UserSignupReq user) {
    return userService.signup(user);
  }

}
