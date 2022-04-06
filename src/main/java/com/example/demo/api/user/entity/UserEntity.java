package com.example.demo.api.user.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "USER_TB")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = false)
@Schema(description = "USER_TB 테이블")
public class UserEntity implements Serializable {

  @Id
  @Column(name = "USER_ID")
  @Schema(description = "유저 아이디", required = true, example = "testID")
  private String userId;

  @Column(name = "USER_NM")
  @Schema(description = "유저 이름", example = "testname")
  private String userName;

  @Column(name = "USER_PWD")
  @Schema(description = "유저 비밀번호", example = "password")
  private String userPasswd;

}
