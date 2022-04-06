package com.example.demo.api.user.dto;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSignupRes {

  @NotNull
  @Schema(description = "유저 아이디", required = true, example = "testID")
  private String userId;

  @Schema(description = "유저 이름", example = "testname")
  private String userName;

}
