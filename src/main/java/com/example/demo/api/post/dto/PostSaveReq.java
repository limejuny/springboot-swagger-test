package com.example.demo.api.post.dto;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

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
  private Long postNum;
  @NotNull
  private String postTitle;
  @NotNull
  private String postAuthor;
  private String postId;
  private String postIp;
  @NotNull
  private LocalDateTime postDate;
  @NotNull
  private Long postCommentCount;
  @NotNull
  private Long postGallCount;
  @NotNull
  private Long postGallRecommend;

}
