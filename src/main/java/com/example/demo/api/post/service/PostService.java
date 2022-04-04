package com.example.demo.api.post.service;

import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;
import com.example.demo.api.post.entity.PostEntity;
import com.example.demo.api.post.repository.PostRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

  private final PostRepository postRepository;

  public PostSaveRes createPost(PostSaveReq postSaveReq) {
    return toPostSaveRes(postRepository.save(toPostEntity(postSaveReq)));
  }

  private PostEntity toPostEntity(PostSaveReq postSaveReq) {
    return PostEntity.builder()
        .postNum(postSaveReq.getPostNum())
        .postTitle(postSaveReq.getPostTitle())
        .postAuthor(postSaveReq.getPostAuthor())
        .postId(postSaveReq.getPostId())
        .postIp(postSaveReq.getPostIp())
        .postDate(postSaveReq.getPostDate())
        .postCommentCount(postSaveReq.getPostCommentCount())
        .postGallCount(postSaveReq.getPostGallCount())
        .postGallRecommend(postSaveReq.getPostGallRecommend())
        .build();
  }

  private PostSaveRes toPostSaveRes(PostEntity postEntity) {
    return PostSaveRes.builder()
        .postNum(postEntity.getPostNum())
        .build();
  }

}
