package com.example.demo.api.post.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostInfoRes {

  private Long postNum;
  private String postTitle;
  private String postAuthor;
  private String postId;
  private String postIp;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime postDate;
  private Long postCommentCount;
  private Long postGallCount;
  private Long postGallRecommend;

}
