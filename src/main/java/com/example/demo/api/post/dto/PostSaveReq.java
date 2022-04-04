package com.example.demo.api.post.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostSaveReq {

  private Long postNum;
  private String postTitle;
  private String postAuthor;
  private String postId;
  private String postIp;
  private LocalDateTime postDate;
  private Long postCommentCount;
  private Long postGallCount;
  private Long postGallRecommend;

}
