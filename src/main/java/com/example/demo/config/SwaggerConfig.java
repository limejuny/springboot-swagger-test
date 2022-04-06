package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI springShopOpenAPI() {
    return new OpenAPI()
        .info(new Info().title("Spring Swagger API")
            .description("테스트 프로젝트 입니다.")
            .version("v0.0.1")
            .license(new License().name("Apache 2.0").url("https://www.apache.org/licenses/")))
        .externalDocs(new ExternalDocumentation()
            .description("OpenAPI 3 Libraury for spring-boot Documentation")
            .url("https://springdoc.org/"));
  }

}
