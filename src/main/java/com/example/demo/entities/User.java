package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Entity
@Schema(description = "USER_TB 테이블")
@Table(name = "USER_TB")
@Data
public class User {
  @Id
  @Column(name = "USER_ID")
  @ApiModelProperty(value = "유저 아이디", required = true, example = "testID")
  private String userId;

  @Column(name = "USER_NM")
  @ApiModelProperty(value = "유저 이름", example = "testname")
  private String userName;
}
