package com.example.demo;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  @PostConstruct
  void init() {
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
