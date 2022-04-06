package com.example.demo.api.post.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "게시글 등록 응답 DTO")
public class PostSaveRes {

  @Schema(description = "게시글 번호", required = true, example = "1234")
  private Long postNum;

}
