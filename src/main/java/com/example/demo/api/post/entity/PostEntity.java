package com.example.demo.api.post.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "POST_TB")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = false)
@Schema(description = "POST_TB 테이블")
public class PostEntity implements Serializable {

  @Id
  @Column(name = "POST_NUM")
  @ApiModelProperty(value = "게시글 번호", required = true, example = "1234")
  private Long postNum;

  @Column(name = "POST_TITLE")
  @ApiModelProperty(value = "게시글 제목", example = "title")
  private String postTitle;

  @Column(name = "POST_AUTHOR")
  @ApiModelProperty(value = "게시글 작성자", example = "author")
  private String postAuthor;

  @Column(name = "POST_ID")
  @ApiModelProperty(value = "게시글 작성자 아이디", example = "id")
  private String postId;

  @Column(name = "POST_IP")
  @ApiModelProperty(value = "게시글 작성자 아이피", example = "123.213")
  private String postIp;

  @Column(name = "POST_DATE")
  @ApiModelProperty(value = "게시글 작성시간", example = "2022-01-01T00:00:00")
  private LocalDateTime postDate;

  @Column(name = "POST_COMMENT_COUNT")
  @ApiModelProperty(value = "게시글 댓글수", example = "1")
  private Long postCommentCount;

  @Column(name = "POST_GALL_COUNT")
  @ApiModelProperty(value = "게시글 조회수", example = "1")
  private Long postGallCount;

  @Column(name = "POST_GALL_RECOMMEND")
  @ApiModelProperty(value = "게시글 추천수", example = "1")
  private Long postGallRecommend;

}
