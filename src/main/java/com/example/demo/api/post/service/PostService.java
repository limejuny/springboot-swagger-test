package com.example.demo.api.post.service;

import java.util.List;

import com.example.demo.api.post.dto.PostInfoRes;
import com.example.demo.api.post.dto.PostSaveReq;
import com.example.demo.api.post.dto.PostSaveRes;
import com.example.demo.api.post.entity.PostMapper;
import com.example.demo.api.post.repository.PostRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {

  private final PostRepository postRepository;
  private final PostMapper postMapper;

  public PostSaveRes createPost(PostSaveReq postSaveReq) {
    return postMapper.toPostSaveRes(postRepository.save(postMapper.toPostEntity(postSaveReq)));
  }

  public List<PostInfoRes> retrievePostInfoList() {
    return postMapper.toPostInfoResList(postRepository.findAll());
  }

}
