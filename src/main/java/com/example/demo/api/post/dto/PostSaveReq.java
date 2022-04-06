package com.example.demo.api.post.dto;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostSaveReq {

  @NotNull
  @Schema(description = "게시글 번호", required = true, example = "1234")
  private Long postNum;

  @NotNull
  @Schema(description = "게시글 제목", example = "title")
  private String postTitle;

  @NotNull
  @Schema(description = "게시글 작성자", example = "author")
  private String postAuthor;

  @Schema(description = "게시글 작성자 아이디", example = "id")
  private String postId;

  @Schema(description = "게시글 작성자 아이피", example = "123.213")
  private String postIp;

  @NotNull
  @Schema(description = "게시글 작성시간", pattern = "yyyy-MM-dd HH:mm:ss", example = "2022-01-01 00:00:00")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime postDate;

  @NotNull
  @Schema(description = "게시글 댓글수", example = "1")
  private Long postCommentCount;

  @NotNull
  @Schema(description = "게시글 조회수", example = "1")
  private Long postGallCount;

  @NotNull
  @Schema(description = "게시글 추천수", example = "1")
  private Long postGallRecommend;

}
